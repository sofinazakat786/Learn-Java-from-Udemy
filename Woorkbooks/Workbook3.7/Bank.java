
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("\n****ROYAL BANK OF JAVA****");
            System.out.println("Are you here to get a mortgage? (yes or no)");
            String decision = scan.nextLine();

            if (decision.equals("yes")) {
                // -- Print this if the decision is "yes"
                System.out.println("\nGreat! In one line" + "\nHow much money do you have in your savings?"
                        + "\nAnd, how much do you owe in credit card debt?");
                int money = scan.nextInt();
                int debt = scan.nextInt();

                System.out.println("\nHow many years have you worked for?");
                int workExperience = scan.nextInt();

                scan.nextLine();  // Consume the leftover newline

                if (money >= 10000 && debt <= 5000 && workExperience > 2) {
                    System.out.println("What is your name?");
                    String name = scan.nextLine();
                    System.out.println("Congratulations " + name + ", your loan has been approved!");
                } else {
                    System.out.println("Sorry, you are not eligible for a mortgage");
                }
            } else {
                // -- Print this if the decision is not "yes"
                System.out.println("\nOK. Have a nice day!");
            }
        }
    }
}
