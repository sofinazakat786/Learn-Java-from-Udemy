
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        try {
            readFile("greetings.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File Not found Expection; "+ e.getMessage());
        }
    }
    public static void readFile(String fileName) throws  FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fis);
        if (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        } else {
            System.out.println("The file is empty.");
        }
        scanner.close();

    }
}
