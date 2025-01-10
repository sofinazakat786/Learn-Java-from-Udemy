public class Book {
    private String title;
    private String author;
    private double ratings;
    private double price;

    public Book(Book other){
        this.title = title;
        this.author = author;
        this.ratings = ratings;
        this.price = price;

    }

    public Book(String title, String author, double ratings, double price) {
        this.title = title;
        this.author = author;
        this.ratings = ratings;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRatings() {
        return this.ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Ratings: "+ ratings + ", Price: $" + price;
    }
        
}
