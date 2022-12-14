import java.util.BitSet;
import java.util.Scanner;

public class BitSetTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String[] input = scanner.nextLine().split(" ");
            switch (input[0]) {
                case "AND":
                    if (input[1].equals("1"))
                        B1.and(B2);
                    else B2.and(B1);
                    System.out.println(B1.cardinality() + " " + B2.cardinality());
                    break;
                case "SET":
                    if (input[1].equals("1"))
                        B1.set(Integer.parseInt(input[2]));
                    else
                        B2.set(Integer.parseInt(input[2]));
                    System.out.println(B1.cardinality() + " " + B2.cardinality());
                    break;
                case "FLIP":
                    if (input[1].equals("1"))
                        B1.flip(Integer.parseInt(input[2]));
                    else B2.and(B1);
                    System.out.println(B1.cardinality() + " " + B2.cardinality());
                    break;
                case "OR":
                    if (input[1].equals("1"))
                        B1.or(B2);
                    else B2.or(B1);
                    System.out.println(B1.cardinality() + " " + B2.cardinality());
                    break;
                default:
                    System.out.println("Not supported operation");
                    break;
            }
        }

    }
}
