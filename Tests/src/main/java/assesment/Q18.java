package assesment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q18 {
    public static void main(String[] args) {
        Set<? extends RuntimeException> set;
        set = new HashSet<RuntimeException>();
        set = new TreeSet<NullPointerException>();
    }
}
