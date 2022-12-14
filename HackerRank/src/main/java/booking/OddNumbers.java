package booking;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNumbers {
    public static void main(String[] args) {

    }

    public static List<Integer> oddNumbers(int l, int r) {
        return IntStream.range(l, r + 1).filter(value -> value%2!=0).boxed().collect(Collectors.toList());

    }
}
