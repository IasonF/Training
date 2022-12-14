package assesment;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Q20 {
    public static void main(String[] args) {
        Stream<LocalDate> s = Stream.of(LocalDate.now());
        UnaryOperator<LocalDate> u = l -> l;
        s.filter(l -> l != null).map(u).peek(System.out::println).forEach(System.out::println);
        List<String> list = new ArrayList<>();
        list.forEach(System.out::println);
        NumberFormat.getCurrencyInstance();

    }
}
