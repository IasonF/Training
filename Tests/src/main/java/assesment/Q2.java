package assesment;

public abstract class Q2 {
    public String field;
    public abstract void main();

    public static void main(String[] args) {
        Q2 q2 = new child();
        q2.field = "1234567890";
        q2.main();

    }

    static class child extends Q2 {
        @Override
        public void main() {
            System.out.println("Text message to " + field);
        }
    }
}
