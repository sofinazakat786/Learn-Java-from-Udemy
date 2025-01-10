
public class Main {

    public static void main(String[] args) {
        // Initialize movies array
        Movie[] movies = new Movie[]{
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        Store store = new Store();

        // Populate store using foreach loop
        for (Movie movie : movies) {
            store.addMovie(movie);
        }

        printStore(store);

        userInput(store);
    }

    public static void printStore(Store store) {
        System.out.println("******************************MOVIE STORE*****************************");
        for (Movie movie : store.getMovies()) {
            System.out.printf("%.1f\t%-15s\t%s\n", movie.getRating(), movie.getFormat(), movie.getName());
        }
    }

    public static void userInput(Store store) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Please choose an integer between 0 - 9: ");
            int index = scanner.nextInt();
            if (index < 0 || index >= store.getMovies().size()) {
                System.out.println("Invalid index. Try again.");
                continue;
            }

            Movie selectedMovie = store.getMovie(index);
            System.out.print("Set a new rating for " + selectedMovie.getName() + ": ");
            double newRating = scanner.nextDouble();
            selectedMovie.setRating(newRating);

            printStore(store);

            System.out.print("To edit another rating, type 'continue': ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("continue")) {
                break;
            }
        }

        scanner.close();
    }
}
