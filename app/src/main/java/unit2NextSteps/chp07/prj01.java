package unit2NextSteps.chp07;

import java.util.Scanner;

/**
 * In a game of guessing numbers, one person says, “I’m thinking of a number between 1
and 100.” The other person guesses “50.” The first person replies, “No, the number is less.” The
second person then guesses “25,” and so on, until she guesses correctly. Write a program that
plays this game. The computer knows the number (a random number between 1 and 100) and
the user is the guesser. At the end of the game, the computer displays the number of guesses
required by the user to guess the number correctly.
 */
public class prj01 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            scanner.useDelimiter("\n");

            int number = (int) (Math.random() * 100) + 1;
            int guess = 0;
            int count = 0;
            System.out.println("I am thinking of a number between 1 and 100.");
            do {
                System.out.println("Enter your guess: ");
                guess = scanner.nextInt();
                count++;
                if (guess < number) {
                    System.out.println("No, your guess is less than the number.");
                } else if (guess > number) {
                    System.out.println("No, your guess is greater than the number.");
                }
            } while (guess != number);
            System.out.println("You guessed the number in " + count + " tries.");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
