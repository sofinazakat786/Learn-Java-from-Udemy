
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Movie> movies;

    public Store() {
        this.movies = new ArrayList<>();
    }

    public Movie getMovie(int index) {
        if (index >= 0 && index < movies.size()) {
            return movies.get(index);
        }
        return null; // Return null if the index is out of bounds.
    }

    public void setMovie(int index, Movie movie) {
        if (index >= 0 && index < movies.size()) {
            movies.set(index, movie);
        }
    }

    public static void addMovie(Movie movie) {
        // movies.add(movie); // Add the movie to the list.
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
