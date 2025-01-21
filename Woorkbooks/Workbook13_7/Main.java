package Workbook13_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Workbook13_7\\email.txt");
        // Files.lines(path).forEach(line -> System.out.println(line));
        Files.lines(path)
                .filter(email -> !(email.startsWith("Spam") || email.startsWith("Promotions")))
                .forEach(email -> System.out.println(email));
    }

}
