import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalTest {
    public static void main(String[] args) {
        String s = "92233720368547758071";
        System.out.println(Long.MAX_VALUE);
        int i = -1;
        System.out.println("i is : " + i);
        //BigInteger big = BigInteger.valueOf(Long.parseLong(s));
        //System.out.println(big);
        BigInteger big2 = new BigInteger(s);
        System.out.println(big2);
        System.out.println((big2.isProbablePrime(10) == true ? "prime" : "not prime"));
        canWin();

    }

    private static void canWin() {
    }


}
