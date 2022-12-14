package ict;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Serialization {
    public static void main(String[] args) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("output.txt"));){
            stream.writeObject(new C1());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class A1 implements Serializable{
    int ser = 1;
    static int nonSer = 2;
}

class B1 {
    A1 nonSer = new A1();
}

class C1 implements Serializable{
    LocalDate created = LocalDate.now();
    static int nonSerializable = 0;
    transient int nonSerializable2 = 0;
    A1 a1 = new A1();
    B1 nonSerializable3 = new B1();

}
