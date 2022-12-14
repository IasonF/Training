import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

class Prime {
    public void checkPrime(int... n) {
        for (int i = 0; i < n.length; i++) {
            if (isPrime(n[i]))
                System.out.print(n[i] + " ");
        }
        System.out.println();
    }

    boolean isPrime(int number) {
        if (number == 1)
            return true;
        if (number == 2)
            return true;

        for (int j = 3; j < number / 2 + 1; j = j + 2)
            if (number % j == 0)
                return false;

        return true;
    }
}


public class Primes {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
