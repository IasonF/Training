package ict;

import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class AddAWeek {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        now.plus(Period.ofDays(7));
        now.plusDays(7);
        now.plus(7, ChronoUnit.DAYS);
    }
}
