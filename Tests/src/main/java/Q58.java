public class Q58 {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("false");
        boolean b2;
        b2 = b1.booleanValue();
        if (!b2) {
            b2 = true;
            System.out.println("a");
        }
        if (b1 & b2)
            System.out.println("b");
        System.out.println("c");
    }
}
