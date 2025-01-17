package EP3;

import static EP3.Car.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String make = promptForMake(scanner);
        String model = promptForModel(scanner);
        BodyType bodyType = promptForBodyType(scanner);
        int year = promptForYear(scanner);
        double price = promptForPrice(scanner);

        Car newCar = new Car(make, model, bodyType, year, price);

        CarDealership dealership = new CarDealership();
        dealership.addCar(newCar);

        System.out.println("Car added to the dealership: " + newCar.getMake() + " " + newCar.getModel());
    }

    public static boolean IsNullOrBlank(String input) {

        return input == null || input.isBlank();
    }

    public static boolean invalidYear(int year) {

        return year < Car.MIN_YEAR;

    }

    public static boolean invaildPrice(double price) {
        return price < MIN_PRICE || price > MAX_PRICE;
    }

    public static boolean invalidBodyType(BodyType bodytype) {
        if (bodytype == null) {
            return true; // Null body type is invalid
        }
        try {
            // Validate if the enum value exists (not necessary here since `bodytype` is already a valid enum constant)
            BodyType.valueOf(bodytype.name());
            return false;
        } catch (IllegalArgumentException exception) {
            return true;
        }
    }

    public static String promptForMake(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease Enter a valid car make: ");
            String make = scanner.nextLine();
            if (!IsNullOrBlank(make)) {
                return make;
            }
        }
    }
    public static BodyType promptForBodyType(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid car body type (SEDAN, COUPE, HATCHBACK, SUV, TRUCK, VAN): ");
            String input = scanner.nextLine().trim().toUpperCase();
            try {
                return BodyType.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid body type entered. Please try again.");
            }
        }
    }
    

    public static String promptForModel(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid car model: ");
            String model = scanner.nextLine();
            if (!IsNullOrBlank(model)) {
                return model;
            }
        }
    }

    public static int promptForYear(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid production year: ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int year = scanner.nextInt();
            if (!invalidYear(year)) {
                return year;
            }
        }
    }

    public static double promptForPrice(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid price: ");
            if (!scanner.hasNextDouble()) {
                scanner.next();
                continue;
            }
            double price = scanner.nextDouble();
            if (!invaildPrice(price)) {
                return price;
            }

        }
    }
}
