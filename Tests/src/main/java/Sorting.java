import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class Sorting {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        new TreeSet<>(strings);
        TreeSet<String> strings1 = new TreeSet<>(Comparator.comparingInt(String::length).reversed());
        strings1.add("one");
        strings1.add("three");
        System.out.println(strings1.pollFirst());



    }
}
