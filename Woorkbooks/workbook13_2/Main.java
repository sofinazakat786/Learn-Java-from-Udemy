
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(55.99, 33.99, 88.99, 11.49, 55.99, 111.99, 77.99);

        // Task 1: Sort the prices in decending order sort((a, b) -> a.compareTo(b)); //Accending order
        prices.sort((a, b) -> b.compareTo(a));
        System.out.println("\nPrices\n------");

        // Task 2: 
        prices.forEach((price) -> System.out.println(price));

        List<String> books = Arrays.asList(
                "To Kill a Mockingbird",
                "The Great Gatsby",
                "Pride and Prejudice",
                "The Catcher in the Rye",
                "The Alchemist",
                "One Hundred Years of Solitude",
                "Moby-Dick",
                "The Brothers Karamazov",
                "The Lord of the Rings",
                "The Picture of Dorian Gray"
        );

        // TODO

        books.sort((a ,b ) -> a.compareTo(b));
        System.out.println("\nLibrary\n--------");
        books.forEach((book) -> System.out.println(book));

        // TODO
    }
}
