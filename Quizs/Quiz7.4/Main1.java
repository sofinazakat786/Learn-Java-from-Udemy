
import java.util.Arrays;


public class Main1 {
public static void main(String[] args) {
        // Test Case: Passport Approved
        System.out.println("Test Case: Passport Approved.\n");
        Person passenger1 = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
        boolean isApproved1 = true; // Simulate passport approval

        if (isApproved1) {
            passenger1.setPassport();
        }
        System.out.println("Name: " + passenger1.getName() + "\n"
                + "Nationality: " + passenger1.getNationality() + "\n"
                + "Date of Birth: " + passenger1.getDateOfBirth() + "\n"
                + "Seat Number: " + passenger1.getSeatNumber() + "\n"
                + "Passport: " + Arrays.toString(passenger1.getPassport()) + "\n");

        // Test Case: Passport Denied
        System.out.println("Test Case: Passport Denied.\n");
        Person passenger2 = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
        boolean isApproved2 = true; // Simulate passport denial

        if (isApproved2) {
            passenger2.setPassport();
        }

        // Print details for passenger2
        System.out.println("Name: " + passenger2.getName() + "\n"
                + "Nationality: " + passenger2.getNationality() + "\n"
                + "Date of Birth: " + passenger2.getDateOfBirth() + "\n"
                + "Seat Number: " + passenger2.getSeatNumber() + "\n"
                + "Passport: " + Arrays.toString(passenger2.getPassport()) + "\n");
    }
}