package assesment;

import java.time.Duration;
import java.time.Period;

public class Q16 {
    public static void main(String[] args) {
        String d = Duration.ofDays(1).toString();
        String p = Period.ofDays(1).toString();
        System.out.println(Duration.ofDays(1));
        System.out.println(Period.ofDays(1));
        boolean b1 = d == p;
        boolean b2 = d.equals(p);
        System.out.println(b1 + " " + b2);
    }
}
