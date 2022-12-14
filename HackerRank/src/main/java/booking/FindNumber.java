package booking;

import java.util.ArrayList;
import java.util.List;

public class FindNumber {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        System.out.println(findNumber(array, 5));
    }
    public static String findNumber(List<Integer> arr, int k) {
        return arr.contains(k)? "YES" : "NO";
    }
}
