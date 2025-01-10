public class Main {
    public static void main(String[] args) {
        try {


            Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
            System.out.println("Magazine Details:\n" + magazine1);

            magazine1.setTitle("The Pink City");
            magazine1.setPublicationYear(2025);
            System.out.println("Updated Magazine Details:\n" + magazine1);


        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        System.out.println("added a new line");
    }
}
