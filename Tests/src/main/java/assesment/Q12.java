package assesment;

import java.util.Locale;
import java.util.ResourceBundle;

public class Q12 {
    public static void main(String[] args) {
        Locale fr = new Locale("fr");
        ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);
        System.out.println(b.getString("name"));
        System.out.println(b.getString("age"));
    }
}
