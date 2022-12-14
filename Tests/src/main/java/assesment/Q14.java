package assesment;

import java.util.Scanner;

public class Q14 {

    static class RainException extends Exception {
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner("rain"); ) {
            String line = "";
            if (s.nextLine().equals("rain")) throw new RainException();
            throw new Throwable();
        } catch (RainException e) {
            System.out.println("Only Runtime exceptions and Errors are unchecked!");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
        }
    }
}


