
import java.util.Scanner;

public class WeatherNetwork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("What is the temperature right now?");
        int temp = scanner.nextInt();
        scanner.close();
        String forecast;

        if (temp <= -1) {
            forecast = "The forecast is FREEZING! Stay home!";
        } else if (temp <= -10) {
            forecast = "The forecast is Chilly. Wear a coat!";
        } else {
            forecast = "It's warm. Go outside!";
        }

        System.out.println(forecast);
    }
}
