package unit2NextSteps.chp07;

import java.util.Scanner;


public class prj01and02 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            // scanner.useDelimiter("\n");

            int numOfGuesses = guessBetween1and100(scanner);
            System.out.println("You guessed the number in " + numOfGuesses + " tries.");
            System.out.println("-------------------");

            numOfGuesses = youPickComputerGuesses(scanner);
            System.out.println("The computer guessed the number in " + numOfGuesses + " tries.");
            System.out.println("-------------------");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // making method public so that app can use it in overall menu.
    /**
    In a game of guessing numbers, one person says, “I’m thinking of a number between 1
    and 100.” The other person guesses “50.” The first person replies, “No, the number is less.” The
    second person then guesses “25,” and so on, until she guesses correctly. Write a program that
    plays this game. The computer knows the number (a random number between 1 and 100) and
    the user is the guesser. At the end of the game, the computer displays the number of guesses
    required by the user to guess the number correctly.
    */
    public static int guessBetween1and100(Scanner scanner) {
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

        return count;
    }

    /*
     * in the game of guessing numbers, let the user pick a number between 1 and 100. The computer
     * then makes guesses at the number until it guesses correctly.
     */
    public static int youPickComputerGuesses(Scanner scanner){
            System.out.println("Enter your (secret) number between 1 and 100.");
            int number = scanner.nextInt();
            int guess = 0;
            int count = 0;
            do {
                guess = (int) (Math.random() * 100) + 1;
                count++;
                if (guess < number) {
                    System.out.println("The computer guessed " + guess + ", which is less than the number.");
                } else if (guess > number) {
                    System.out.println("The computer guessed " + guess + ", which is greater than the number.");
                }
            } while (guess != number);

            return count;
    }
}
