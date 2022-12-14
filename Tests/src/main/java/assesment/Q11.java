package assesment;

import java.util.Optional;
import java.util.stream.Stream;

public class Q11 {
    private static void magic(Stream<Integer> s) {
        Optional o = s.filter(x -> x < 5).limit(3).max((x, y) -> x - y);
        System.out.println(o.get());
    }

    public static void main(String[] args) {
        try {
            magic(Stream.empty());
        } catch (Exception e) {
            System.out.println("Optional get method throws unchecked NoSuchElementExeption");
        }
        magic(Stream.iterate(1, integer -> integer++));
        magic(Stream.of(5,10));
    }

}
