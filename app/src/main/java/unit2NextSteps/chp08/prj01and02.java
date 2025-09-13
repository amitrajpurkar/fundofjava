package unit2NextSteps.chp08;

import java.util.Scanner;

public class prj01and02 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        callSquareRoot();
    }

    public static void callSquareRoot() {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useDelimiter("\n");
            boolean wantMoreTry = true;

            do {
                System.out.println("Enter a number: ");
                double number = scanner.nextDouble();
                System.out.println("Enter the number of approximations: ");
                int approximations = scanner.nextInt();
                double squareRoot = squareRoot(number, approximations);
                System.out.println("The square root of " + number + " is " + squareRoot);

                System.out.println("Do you want to try again? (y/n)");
                String answer = scanner.next();
                if (answer.equals("y")) {
                    wantMoreTry = true;
                } else {
                    wantMoreTry = false;
                    System.out.println("good bye");
                }
            } while (wantMoreTry);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Newton’s method for computing the square root of a number consists of
     * approximating the
     * actual square root by means of a set of transformations. Each transformation
     * starts with a guess
     * at the square root. A better approximation is then (guess + number / guess) /
     * 2. This result
     * becomes the guess for the next approximation. The initial guess is 1. Write a
     * query-driven pro-
     * gram that allows the user to enter a number and the number of approximations
     * to compute its
     * square root
     */
    public static double squareRoot(double number, int approximations) {
        double guess = 1;
        for (int i = 0; i < approximations; i++) {
            guess = (guess + number / guess) / 2;
        }
        return guess;
    }
}
