package unit3ArraysClasses.chp10;

import java.util.Arrays;
import java.util.Scanner;

public class project04 {
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
            Double mode = median(numbers);
            System.out.println("Mode: " + mode);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * The median of a list of numbers is the value in the middle of the list if the list is arranged in order.
Add to the program of Project 10-3 the capability of displaying the median of the list of numbers
     */
    public static Double median(Double[] nums) {
        Double median;
        Arrays.sort(nums);
        if (nums.length % 2 == 1) {             // if the length of the array is odd, the median is the middle element
            median = nums[nums.length / 2];
        } else {                                // if the length of the array is even, the median is the average of the two middle elements
            median = (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
        }

        return median;
    }
}
