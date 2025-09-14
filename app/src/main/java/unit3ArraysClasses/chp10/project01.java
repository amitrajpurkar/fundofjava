package unit3ArraysClasses.chp10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class project01 {
    public static void main(String[] args) {
        askForIntegers();
    }

    public static void askForIntegers() {
        try(Scanner scanner = new Scanner(System.in)) {
            scanner.useDelimiter("\n");

            Integer[] integers = new Integer[10];
            for (int i = 0; i < integers.length; i++) {
                System.out.println("Enter an integer: ");
                integers[i] = scanner.nextInt();
            }

            Map<String, ArrayList<Integer>> sortedIntegers = sortOddEven(integers);
            System.out.println("Even List: " + sortedIntegers.get("evenList"));
            System.out.println("Odd List: " + sortedIntegers.get("oddList"));
            System.out.println("Negative List: " + sortedIntegers.get("negativeList"));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Write a program that takes 10 integers as input. The program places the even integers into an
array called evenList, the odd integers into an array called oddList, and the negative integers
into an array called negativeList. The program displays the contents of the three arrays after
all of the integers have been entered
     */
    public static Map<String, ArrayList<Integer>> sortOddEven(Integer[] args) {
        Map<String, ArrayList<Integer>> sortedIntegers = new HashMap<>();

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> negativeList = new ArrayList<>();

        for (Integer arg : args) {
            if (arg % 2 == 0) {
                evenList.add(arg);
            } else if (arg < 0) {
                negativeList.add(arg);
            } else {
                oddList.add(arg);
            }
        }

        sortedIntegers.put("evenList", evenList);
        sortedIntegers.put("oddList", oddList);
        sortedIntegers.put("negativeList", negativeList);
        return sortedIntegers;
    }
}
