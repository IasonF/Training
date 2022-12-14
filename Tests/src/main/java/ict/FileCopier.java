package ict;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopier {
    public static void main(String[] args) {
        Path in = Paths.get("/Users/jason/IdeaProjects/Training/Tests/src/main/resources/in.txt");
        Path out = Paths.get("/Users/jason/IdeaProjects/Training/Tests/src/main/resources/out.txt");
        try (FileInputStream inputStream = new FileInputStream(in.toFile());
             FileOutputStream ouputstream = new FileOutputStream(out.toFile())) {
            byte b;
            while ((b = (byte) inputStream.read()) != -1) {
                System.out.println(b);
                System.out.printf("0x%02X", b);
                ouputstream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
