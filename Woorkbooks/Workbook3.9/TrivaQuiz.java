
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrivaQuiz {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String[] questions = {
                "1. Which country held the 2016 summer olympics?",
                "2. Who is the president of the United States in 2020?",
                "3. What is the capital of Japan?",
                "4. What is the tallest mountain in the world?"
            };

            String[] options = {
                "\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy",
                "\ta) Barack Obama\n\tb) Joe Biden\n\tc) Donald Trump\n\td) George Bush",
                "\ta) Seoul\n\tb) Tokyo\n\tc) Beijing\n\td) Bangkok",
                "\ta) Mount Fuji\n\tb) K2\n\tc) Mount Kilimanjaro\n\td) Mount Everest"
            };
            // Array to store user answers
            String[] userAnswers = new String[questions.length];

            // Ask questions to the user and store answers in userAnswers
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                System.out.println(options[i]);
                userAnswers[i] = scan.nextLine().trim();
            }

            int score = 0;

            try {
                try ( // Read correct answers from file
                        Scanner fileReader = new Scanner(new File("C:\\Users\\NazakatNazir_Sofi\\Documents\\Learn Java\\Java Development Bootcamp\\Woorkbooks\\Workbook3.9\\answers.txt"))) {
                    int questionIndex = 0;

                    while (fileReader.hasNextLine()) {
                        String correctAnswer = fileReader.nextLine().trim();
                        if (correctAnswer.equalsIgnoreCase(userAnswers[questionIndex])) {
                            score += 5;
                        }
                        questionIndex++;
                    }
                }

            } catch (FileNotFoundException e) {
                System.out.println("Error: Answers file not found.");
                return;
            }
            System.out.println("Your score is " + score + "/20");
            if (score >= 15) {
                System.out.println("Wow!, you know your stuff");

            } else if (score >= 5) {
                System.out.println("Not bad!");
            } else {
                System.out.println("Better luck next time!");
            }
        }
    }

}
