package booking;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopK {
    public static void main(String[] args) {

    }

    public static List<Integer> awardTopKHotels(String positiveKeywords, String negativeKeywords, List<Integer> hotelIds, List<String> reviews, int k) {

        Set<String> positive = Stream.of(positiveKeywords.split(",")).map(String::toLowerCase).collect(Collectors.toSet());
        Set<String> negative = Stream.of(negativeKeywords.split(",")).map(String::toLowerCase).collect(Collectors.toSet());

        Map<Integer, Long> hotelScore = new HashMap<>();
        for (int i = 0; i < reviews.size(); i++) {
            int hotelId = hotelIds.get(i);
            List<String> review = Arrays.asList(reviews.get(i)
                    .replace(".", "")
                    .replace(",", "")
                    .toLowerCase()
                    .split(" "));
            long pos = review.stream()
                    .filter(positive::contains)
                    .count();
            long neg = (int) review.stream()
                    .filter(negative::contains)
                    .count();
            long total = pos * 3 + neg * -1;
            long current = hotelScore.getOrDefault(hotelId, 0L);
            hotelScore.put(hotelId, current + total);
        }
        return hotelScore.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}

