package assesment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q17 {
    public static void main(String[] args) {
        Path path = Paths.get("/gorilla/signed-words.txt");
        try {
            Files.find(path.getParent(), 10, // k1
                    (Path p, BasicFileAttributes b) -> p.toString().endsWith(".txt") && Files.isDirectory(p)) // k2
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Files.find throws IOException. Files.isDirectory DOESN'T throw an exception");
        }

        try {
            Files.readAllLines(path) // k3
                    .stream()
                    .flatMap(p -> Stream.of(p.split(" "))) // k4
                    .map(s -> s.toLowerCase())
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Files.readAllLines return a List NOT a stream!");
        }
    }
}
