
import java.util.Scanner;
import java.util.Random;

    public class task1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            int minRange = 1; // minimum number in the range
            int maxRange = 100; // maximum number in the range
            int generatedNumber = rand.nextInt(maxRange - minRange + 1) + minRange;
            int attemptsLeft = 10; // number of attempts allowed
            int score = 0; // initialize score to 0

            System.out.println("Guess the number between " + minRange + " and " + maxRange + ".");

            while (attemptsLeft > 0) {
                System.out.print("Guess (" + attemptsLeft + " attempts left): ");
                int guessedNumber = input.nextInt();

                if (guessedNumber == generatedNumber) {
                    score += attemptsLeft; // add remaining attempts to score
                    System.out.println("Congratulations! You guessed the number.");
                    break; // exit the loop if number is guessed correctly
                } else if (guessedNumber < generatedNumber) {
                    System.out.println("The number is higher.");
                } else {
                    System.out.println("The number is lower.");
                }

                attemptsLeft--;
            }

            if (attemptsLeft == 0) {
                System.out.println("Sorry, you ran out of attempts. The number was " + generatedNumber + ".");
            }

            System.out.println("Your score is: " + score);
        }
    }
