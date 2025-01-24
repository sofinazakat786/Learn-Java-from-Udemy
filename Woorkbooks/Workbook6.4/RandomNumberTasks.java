
import java.util.Random;

public class RandomNumberTasks {

    // Task 1: Function to return a random number between 0 and 49999
    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public static void main(String[] args) {
        // Task 2: Create an array to store 10 random numbers
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = randomNumber();
        }
        // System.out.println("Random number Array: " + Arrays.toString(randomNumbers));

        // Task 3: Print every element on the same line with one space between each
        System.out.print("Here are the scores: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        // Task 4: Find and print the highest score in the array
        int highScore = 0;
        for (int score : randomNumbers) {
            if (score > highScore) {
                highScore = score;
            }
        }
        System.out.println("The highest score is: " + highScore);
    }

}
