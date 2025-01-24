
import java.util.Scanner;

public class AislesStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWhat do you want to check in out aisle?");
        String itemToFind = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equals(itemToFind)) {
                System.out.println("\nYes! We have [" + itemToFind + "] in out aisle at index :" + (i + 1));
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Sorry! we don't have " + itemToFind + " right now");
        }
    }
}
