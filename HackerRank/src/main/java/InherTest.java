public class InherTest {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.i);

    }

}

class A {
    int i = 10;
}

class B extends A {

}
