package ict;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class PT {
    public static void main(String[] args) {
        System.out.println(Period.of(2019, 1, 1));
        System.out.println(Duration.ofDays(5));
        LocalDate date = LocalDate.now();
        date.plus(24, ChronoUnit.HOURS);
    }
}
