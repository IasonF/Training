package practice.tests;

import java.io.IOException;

public class Ch16Q9 {

    void turnOn() throws IOException {}

    public static void main(String[] args) throws Exception {
        new Ch16Q9().turnOn();

        try {
            throw new IOException(new IOException());
        } catch (IOException e) {};

    }

    void method() throws IOException {}
}

