package unit3ArraysClasses.chp10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static unit3ArraysClasses.chp10.project03.mode;
import static unit3ArraysClasses.chp10.project04.median;

public class project05 {
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
            Double median = median(numbers);
            System.out.println("Median: " + median);
            Map<Double, Integer> freMap = getFreMap(numbers);
            String[] headers = {"Number", "Frequency"};
            printTable(headers, freMap);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void printTable(String[] headers, Map<Double, Integer> freMap) {
        // print headers
        for (String header : headers) {
            System.out.print(header + "\t");
        }
        System.out.println();
        // print separator
        for (int i = 0; i < headers.length; i++) {
            System.out.print("-".repeat(20));
        }
        System.out.println();
        // print values
        for (Map.Entry<Double, Integer> entry : freMap.entrySet()) {
            System.out.print(entry.getKey() + "\t");
            System.out.println(entry.getValue());
        }
    }

    public static Map<Double, Integer> getFreMap(Double[] nums) {
        Map<Double, Integer> map = new HashMap<>();
        for (Double num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }
}
