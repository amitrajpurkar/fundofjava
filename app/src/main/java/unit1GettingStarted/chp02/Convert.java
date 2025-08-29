package unit1GettingStarted.chp02;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is: "+celsius);

            //double fahrenheit = celsius * 9 / 5 + 32;
            //System.out.println(fahrenheit);
        }
    }
}
