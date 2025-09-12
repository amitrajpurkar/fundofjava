package unit2NextSteps.chp07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prj08 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useDelimiter("\n");

            Map<String, Integer> map = reportStatisticsOnSentence(scanner);
            System.out.println("Number of words: " + map.get("numberOfWords"));
            System.out.println("Average word length: " + map.get("averageWordLength"));
            System.out.println("Length of sentence: " + map.get("sentenceLength"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Write a program that uses a scanner to report some statistics about words in
     * an input sen-
     * tence. The outputs should be the number of words in the sentence, the average
     * word length, and the length of the sentence.
     */
    public static Map<String, Integer> reportStatisticsOnSentence(Scanner scanner) {
        Map<String, Integer> map = new HashMap<>();

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        int numberOfWords = words.length;
        double averageWordLength = sentence.length() / numberOfWords;

        map.put("numberOfWords", numberOfWords);
        map.put("averageWordLength", (int) averageWordLength);
        map.put("sentenceLength", sentence.length());
        return map;

    }
}
