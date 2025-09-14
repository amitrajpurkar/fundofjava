package unit3ArraysClasses.chp10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class project02 {
    public static void main(String[] args) {
        askForNumbers();
    }

    public static void askForNumbers() {
        try(Scanner scanner = new Scanner(System.in)) {
            scanner.useDelimiter("\n");

            Double[] numbers = new Double[10];
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Enter a decimal number: ");
                numbers[i] = scanner.nextDouble();
            }
            Double average = average(numbers);
            System.out.println("Average: " + average);
            List<Double> greaterThanAverage = new ArrayList<>();
            for (Double number : numbers) {
                if (number > average) {
                    greaterThanAverage.add(number);
                    
                }
            }
            System.out.println("Numbers greater than average: " + greaterThanAverage);
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Write a program that takes 10 floating-point numbers as inputs. The program displays the
average of the numbers followed by all of the numbers that are greater than the average. As part
of your design, write a method that takes an array of doubles as a parameter and returns the
average of the data in the array
     */
    public static Double average(Double[] nums) {
        Double sum = 0.0;
        for (Double num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }
}
