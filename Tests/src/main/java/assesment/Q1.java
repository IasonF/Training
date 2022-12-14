package assesment;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Q1 {
    public static void await (CyclicBarrier cb){
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(1, () -> System.out.println("Cleaned"));
        IntStream.iterate(1, operand -> 1)
                .limit(12)
                .forEach(value -> service.submit(() -> await(cyclicBarrier)));
        service.shutdown();
    }
}
