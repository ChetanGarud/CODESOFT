import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5; // Number of attempts allowed
        int score = 0; // Initialize the score

        System.out.println("--- Welcome to Guess the Number game! ---");

        while (true) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println(
                    "\nI have picked a number between " + minRange + " and " + maxRange + ". Try to guess it!");

            for (int attempt = 1; attempt <= attempts; attempt++) {
                System.out.print("Attempt " + attempt + "/" + attempts + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You have guessed the number!");
                    score += (attempts - attempt + 1); // Update the score based on attempts
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }

                if (attempt == attempts) {
                    System.out.println("You have run out of attempts! The number was: " + randomNumber);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Game over. Your total score is: " + score);
        scanner.close();
    }
}
