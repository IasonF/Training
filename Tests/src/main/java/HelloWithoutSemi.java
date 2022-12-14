import java.util.stream.Stream;

public class HelloWithoutSemi {
    public static void main(String[] args) {
        Stream.of("Hello").peek(System.out::println).count();
        if (System.out.printf("Hello World") == null) {
        }
    }
}
