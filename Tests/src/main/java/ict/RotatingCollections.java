package ict;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotatingCollections {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4, 5);
        System.out.println(ints);
        Collections.rotate(ints, 1);
        System.out.println(ints);

    }
}
