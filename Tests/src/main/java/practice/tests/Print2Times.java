package practice.tests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Print2Times {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Java EE", "Oracle DB");
        strings.stream().filter(s -> s.contains("J")).peek(System.out::println).findAny();
        strings.stream().filter(s -> s.contains("J")).peek(System.out::println).findFirst();
        strings.stream().filter(s -> s.contains("J")).peek(System.out::println).anyMatch((x) ->true);


        Object obj = null;
        try (Closing closing = new Closing()){
            obj = closing;
            closing.i = 10;
        }
        System.out.println(((Closing) obj).i);

    }
}

class Closing implements AutoCloseable {
    int i;
    public void method() {
        System.out.println("Do something");
    }
    @Override
    public void close() {

    }
}
