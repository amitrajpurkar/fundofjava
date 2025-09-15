package unit2NextSteps.chp07;

import java.util.Scanner;

import static unit2NextSteps.chp07.prj01and02.guessBetween1and100;
import static unit2NextSteps.chp07.prj01and02.youPickComputerGuesses;
import static unit2NextSteps.chp07.prj03and04.scoreToGrade;
import static unit2NextSteps.chp07.prj03and04.scoreUsingIf;
import static unit2NextSteps.chp07.prj05.determineGCD;

public class Chapter07 {
    public static void main(String[] args) {
        System.out.println("Chapter 7: Control Structures");
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useDelimiter("\n");

            showMenu();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            do {
                switch (choice) {
                    case 1:
                        int numOfGuesses = guessBetween1and100(scanner);
                        System.out.println("You guessed the number in " + numOfGuesses + " tries.");
                        System.out.println("-------------------");
                        break;
                    case 2:
                        numOfGuesses = youPickComputerGuesses(scanner);
                        System.out.println("The computer guessed the number in " + numOfGuesses + " tries.");
                        System.out.println("-------------------");
                        break;
                    case 3:
                        scoreUsingIf(scanner);
                        System.out.println("-------------------");
                        break;
                    case 4:
                        String grade = scoreToGrade(scanner);
                        System.out.println("Your grade is " + grade);
                        System.out.println("-------------------");
                        break;
                    case 5:
                        determineGCD(scanner);
                        System.out.println("-------------------");
                        break;
                    case 6:
                        System.out.println("You chose to exit.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                if (choice != 6) {
                    showMenu();
                    System.out.println("Enter your choice: ");
                    choice = scanner.nextInt();
                }
            } while (choice != 6);
            System.out.println("Goodbye!");
            System.out.println("===================");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void showMenu() {
        System.out.println("Select one option from the following menu:");
        System.out.println("""
                    1. Call code 7-1 (computer picks, you guess)
                    2. Call code 7-2 (you pick, computer guesses)
                    3. Call code 7-3 (score to grade using if-else)
                    4. Call code 7-4 (score to grade using method and enum)
                    5. Call code 7-5 (determine GCD using Euclidean algorithm)
                    6. Exit
                """);
    }
}
