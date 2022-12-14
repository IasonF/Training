package booking;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultipleXYZ {
    public static void main(String[] args) {
        //multiple(3, 5, 10, 12).forEach(System.out::println);
        multiple(0, 2, 5, 10).forEach(System.out::println);

    }

    public static List<Integer> multiple(int x, int y, int z, int n) {
        int first = x != 0 ? x : Integer.MAX_VALUE;
        int second = y!=0 ? y : Integer.MAX_VALUE;
        int third = z!=0 ? z : Integer.MAX_VALUE;
        return IntStream.range(1, n + 1)
                .filter(value -> value % third!= 0)
                .filter(value -> value % first == 0 || value % second == 0)
                .boxed()
                .collect(Collectors.toList());
    }

}
