
import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much is the bill amount?");
        int bill = scan.nextInt();

        tipTheWaiter(bill);

    }

    public static void tipTheWaiter(double bill) {
        // Calculate 15% tip
        double tip = bill * 0.15;

        // Print the message with the calculated tip
        System.out.println("Your service was wonderful! Please, accept this tip: $" + tip);
    }

}
