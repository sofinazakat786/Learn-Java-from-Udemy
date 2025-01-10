import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String[] args) {
        try {
            loadMovies("movies.txt");
            printStore();
            userInput();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        String status = "continue";

        while (status.equals("continue")) {
            System.out.println("Enter your command:");
            String command = scanner.nextLine();
            // Process the command (not implemented here)
            if (command.equals("exit")) {
                status = "exit";
            }
        }
        scanner.close();
    }

    public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] words = line.split("--");
            Store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
        }
        scanFile.close();
    }

    public static void printStore() {
        System.out.println("*************************MOVIE STORE*******************************");
        System.out.println(store);
    }
}
