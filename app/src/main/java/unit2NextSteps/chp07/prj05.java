package unit2NextSteps.chp07;

import java.util.Scanner;

public class prj05 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useDelimiter("\n");

            determineGCD(scanner);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void determineGCD(Scanner scanner) {
        System.out.println("Enter two positive integers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 < 0 || n2 < 0) {
            System.out.println("Invalid input");
            return;
        }

        double gcd = getGCD(n1, n2);
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd);
    }

    /**
     * The Euclidean algorithm can be used to find the greatest common divisor (GCD)
     * of two pos-
     * itive integers (n1, n2). You can use this algorithm in the following manner:
     * A. Compute the remainder of dividing the larger number by the smaller number.
     * B. Replace the larger number with the smaller number and the smaller number
     * with the
     * remainder.
     * C. Repeat this process until the smaller number is zero:
     * The larger number at this point is the GCD of n1 and n2.
     * Write a program that lets the user enter two integers and then prints each
     * step in the process
     * of using the Euclidean algorithm to find their GCD
     */
    private static double getGCD(int n1, int n2) {
        int larger = Math.max(n1, n2);
        int smaller = Math.min(n1, n2);
        while (smaller != 0) {
            int remainder = larger % smaller;
            larger = smaller;
            smaller = remainder;
        }
        return larger;
    }
}
