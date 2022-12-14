package booking;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class BookingCares {
    public static void main(String[] args) {
        List<List<Integer>> employeeCalls = List.of(
                List.of(1, 100, 105),
                List.of(1, 105, 110),
                List.of(1, 120, 125),
                List.of(1, 125, 130),
                List.of(2, 100, 105),
                List.of(2, 110, 115));
        employeeWithLesserThanKBreaks(employeeCalls, 10);

    }

    public static List<List<Integer>> employeeWithLesserThanKBreaks(List<List<Integer>> employeeCalls, int k) {
        //Map<Integer, List<Integer>> groupPerId = employeeCalls.stream()
          //      .collect(Collectors.toMap(o -> o.get(0), mapping(o.get(1), Collectors.toList()));
        //System.out.println(groupPerId);

        return Collections.emptyList();

    }
}
