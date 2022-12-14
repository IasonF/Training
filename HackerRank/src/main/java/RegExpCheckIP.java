import java.util.Scanner;

public class RegExpCheckIP {
    public static void main(String[] args) {
        String IP = "000.12.12.034";
        System.out.println(IP.matches(new MyRegex().pattern));
    }

}

class MyRegex {

    String pattern = "[0-9]{1,4}.[0-9]{1,4}.[0-9]{1,4}.[0-9]{1,4}";

}

