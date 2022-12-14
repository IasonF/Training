import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger sum = A.add(B);
        BigInteger mu = A.multiply(B);
        System.out.println(sum);
        System.out.println(mu);
    }
}
