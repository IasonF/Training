package pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private class ProductProcess {

    }

    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<Object>();
        list.add(new Integer(3));
        list.add(7/2);
        StringBuilder a = new StringBuilder("a");
        String s = new String("Only String has uppercase");
        s.toUpperCase();
    }
}

