
import java.util.Scanner;

public class Quiz3_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to hit or stay?");
        String option = scan.nextLine();
        if (!option.equals("hit") && !option.equals("stay")) {
            System.out.println("\nInvalid Option");
        } else {
            System.out.println("\nEnd Turn");
        }
        scan.close();
    }
}
