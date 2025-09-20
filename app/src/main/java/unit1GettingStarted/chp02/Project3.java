package unit1GettingStarted.chp02;

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        //todo
        Scanner scanner = new Scanner(System.in);
        convertKilometersToNauticalMiles(scanner);
    }

    /**
     * write a program that takes as input a number of kilometers
     * and prints corresponding nautical miles.
     * you may rely on following information
     * a kilometer represents 1/10000 of the distance between North Pole and Equator
     * there are 90 degrees, containing 60 minutes of arc each, between the North Pole and Equator
     * a nautical mile is one minute of arc
     */
    public static void convertKilometersToNauticalMiles(Scanner scanner) {
        System.out.println("Enter number of kilometers: ");
        double kilometers = scanner.nextDouble();
        double nauticalMiles = kilometers * 90 / 10000;
        System.out.println("The number of nautical miles is: "+nauticalMiles);
    }
}
