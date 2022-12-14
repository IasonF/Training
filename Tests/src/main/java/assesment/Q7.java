package assesment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q7 {

    public static void main(String[] args) {
        Path path1 = Paths.get("/bats/night", "../").resolve(Paths.get("./sleep.txt")).normalize();
        Path path2;

        try {
            path2 = new File("../sleep.txt").toPath().toRealPath();
            System.out.print(Files.isSameFile(path1, path2));
            System.out.print(" " + path1.equals(path2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
