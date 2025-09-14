package unit3ArraysClasses.chp10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class project03 {
    public static void main(String[] args) {
        askForNumbers();
    }

    public static void askForNumbers() {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useDelimiter("\n");
            Double[] numbers = new Double[10];
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Enter a decimal number: ");
                numbers[i] = scanner.nextDouble();
            }
            Double mode = mode(numbers);
            System.out.println("Mode: " + mode);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * The mode of a list of numbers is the number listed most often. Write a program that takes
10 numbers as input and displays the mode of these numbers. Your program should use paral-
lel arrays and a method that takes an array of numbers as a parameter and returns the value that
appears most often in the array.
     */
    public static Double mode(Double[] nums) {
        Double mode = 0.0;

        Map<Double, Integer> map = new HashMap<>();
        for (Double num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }
}
