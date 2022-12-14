package ict;

public class StaticAndNonStatic {
    private double temp = 36.6;

    void print() {
        System.out.println(temp);
    }

    static class Ear extends StaticAndNonStatic {
        static double temp = 35;

        @Override
        void print() {
            System.out.println(super.temp);
        }

        static void staticPrint() {
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        StaticAndNonStatic ear = new StaticAndNonStatic.Ear();
        ear.print();
        Ear.staticPrint();
    }
}
