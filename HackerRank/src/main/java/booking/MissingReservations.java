package booking;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MissingReservations {

    public static void main(String[] args) {

    }

    public static List<Integer> missingReservations(List<List<Integer>> firstReservationList, List<List<Integer>> secondReservationList) {
        List<Integer> firstIds = firstReservationList
                .stream()
                .peek(integers -> System.out.println(integers.get(0) + " " + integers.get(1)))
                .map(integers -> integers.get(0))
                .collect(Collectors.toList());
        List<Integer> secondIds = secondReservationList
                .stream()
                .peek(integers -> System.out.println(integers.get(0) + " " + integers.get(1)))
                .map(integers -> integers.get(0))
                .collect(Collectors.toList());
        secondIds.removeAll(firstIds);
        Collections.sort(secondIds);
        return secondIds;

    }
}
