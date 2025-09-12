package unit2NextSteps.chp07;

import java.util.Scanner;

public class prj08 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        reportStatisticsOnSentence();
    }

    /**
    Write a program that uses a scanner to report some statistics about words in an input sen-
    tence. The outputs should be the number of words in the sentence, the average
    word length, and the length of the sentence.
     */
    public static void reportStatisticsOnSentence() {
        try(Scanner scanner = new Scanner(System.in)) {
            scanner.useDelimiter("\n");

            System.out.println("Enter a sentence: ");
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            int numberOfWords = words.length;
            double averageWordLength = sentence.length() / numberOfWords;
            System.out.println("Number of words: " + numberOfWords);
            System.out.println("Average word length: " + averageWordLength);
            System.out.println("Length of sentence: " + sentence.length());
            
        } catch (Exception e) {
        }
    }
}
