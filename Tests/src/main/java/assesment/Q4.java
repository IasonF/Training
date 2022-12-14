package assesment;

public class Q4<T> {
    T value;

    public Q4(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Q4<String> one = new Q4<String>("a string");
        Q4<Integer> two = new Q4<>(123);
        System.out.print(one.getValue());
        System.out.print(two.getValue());
    }
}
