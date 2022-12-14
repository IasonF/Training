package picnic;

mport java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.Spliterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;
import java.util.stream.Stream;

class TimeoutAndLimit
{
    static <T> Stream<T> generateOrderedStream(Supplier<Optional<T>> s) {
        // Returns an ordered stream with the values of the Optionals returned by s.get(). An empty Optional ends the stream.
        // As pseudocode:
        //     for (Optional<T> o = s.get(); o.isPresent(); o = s.get())
        //         emit o.get();
        return Stream.iterate(s.get(), Optional::isPresent, prev -> s.get())
                .map(Optional::get);
    }

    static <T> Optional<T> advance(Spliterator<T> iter) {
        // Returns an Optional with the next element of the iterator, or an empty Optional if there are no more elements.
        // (This method is much nicer than calling iter.tryAdvance() directly.)
        final var r = new Object() { T elem; };
        return iter.tryAdvance(elem -> r.elem = elem) ? Optional.of(r.elem) : Optional.empty();
    }

    static ThreadFactory daemonThreadFactory() {
        return (r) -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        };
    }

    static <T> Stream<T> timedTake(Stream<T> stream, long timeout, TimeUnit unit) {
        // Traverses the stream until the timeout elapses and returns the traversed elements.
        final long deadlineNanos = System.nanoTime() + unit.toNanos(timeout);
        final ExecutorService executor = Executors.newSingleThreadExecutor(daemonThreadFactory());
        final Spliterator<T> iter = stream.spliterator();
        return generateOrderedStream(() -> {
            try {
                Future<Optional<T>> future = executor.submit(() -> advance(iter));
                long remainingNanos = deadlineNanos - System.nanoTime();
                Optional<T> optElem = future.get(remainingNanos, TimeUnit.NANOSECONDS);
                if (!optElem.isPresent()) { // this is the end of the input stream, so clean up
                    executor.shutdownNow();
                }
                return optElem;
            } catch (TimeoutException e) {
                executor.shutdownNow();
                return Optional.empty(); // mark this as the end of the result stream
            } catch (ExecutionException e) {
                executor.shutdownNow();
                throw new RuntimeException(e.getCause());
            } catch (InterruptedException e) {
                executor.shutdownNow();
                throw new RuntimeException(e);
            }
        });
    }

    static void fillStreamMap(BufferedReader reader) {
        // streaming demo
        long maxDurationSecs = 5;
        timedTake(reader.lines(), maxDurationSecs, TimeUnit.SECONDS)
                .takeWhile(line -> !line.contains("[stop]"))
                .map(line -> "[mapped] " + line)
                .forEachOrdered(System.out::println);
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fillStreamMap(reader);
    }
}
