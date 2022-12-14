import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        String input;
        input = scanner.next();
        try {
            x = Integer.parseInt(input);
        }
        catch (Exception ex) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
