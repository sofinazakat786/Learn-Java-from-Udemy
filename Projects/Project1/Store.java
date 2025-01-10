import java.util.ArrayList;

public class Store {

    private ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<>();
    }

    // Get a copy of a movie at a specific index
    public Movie getMovie(int index) {
        if (index < 0 || index >= movies.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return new Movie(movies.get(index)); // Return a copy of the movie
    }

    // Set or update a movie at a specific index
    public void setMovie(int index, Movie movie) {
        if (index < 0 || index >= movies.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        movies.set(index, new Movie(movie)); // Use a copy of the provided movie
    }

    // Add a new movie to the store
    public void addMovie(Movie movie) {
        movies.add(new Movie(movie)); // Add a copy of the movie
    }

    // Get the number of movies in the store
    public int size() {
        return movies.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < movies.size(); i++) {
            sb.append(i + 1).append(". ").append(movies.get(i)).append("\n");
        }
        return sb.toString();
    }
}
