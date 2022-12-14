package ict;

public class Pointers {
    public static void main(String[] args) {
        A b = new B();
        b.method1();
    }

}

class A extends Pointers {
    void method1(){};
}

class B extends A {
    void method2(){};
}
