package pluralsight;

class ExtendedHolder extends Holder {

    private static final int SIZE = 30;

    private final int size = 20;

    public ExtendedHolder() {
        super(10);
//        this.size = SIZE;
    }

    public int getSize() {
        return this.size;
    }
}

class Outer {
    private Outer() {};
    class Inner {
        private void print() {
            System.out.println("() not allowed on new");
        }
    }

    public static void main(String[] args) {
        new Outer().new Inner().print();
        (new Outer()).new Inner().print();
//        (new Outer()).(new Inner()).print();
    }

}
