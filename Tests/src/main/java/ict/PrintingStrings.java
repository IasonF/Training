package ict;

public class PrintingStrings {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 = new String(s1);
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder("10");

        System.out.println(15 + 15 + s1);
        System.out.println(15 + 15 + sb1.toString());
//        System.out.println(sb1 + 15);
    }
}
