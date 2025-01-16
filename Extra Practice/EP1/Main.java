package EP1;
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);
        Book book3 = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
        Book book4 = new Book("Pride and Prejudice", "jane Austen", 4.25, 10.99);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        book1.setRatings(4.5);
        System.out.println("updated ratings for Book 1: "+book1.getRatings());



    }
}
