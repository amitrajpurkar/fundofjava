package unit2NextSteps.chp07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prj09 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        callSearchWordInFile();
    }

    public static void callSearchWordInFile() {
        try(Scanner scanner = new Scanner(System.in)) {
            // scanner.useDelimiter("\n");

            System.out.println("Enter the name of the file: ");
            String fileName = scanner.nextLine();
            System.out.println("Enter the word to search for: ");
            String word = scanner.nextLine();
            Map<String, Integer> map = searchWordInFile(fileName, word);
            if (map.get("wordCount") == 0) {
                System.out.println("Word not found");
            } else {
                System.out.println("Word found " + map.get("wordCount") + " times");
                System.out.println("Word found at position " + map.get("wordPosition"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
    Write a program that allows the user to search for a given word in a text file. The two inputs
    are the file’s name and the target word. If the target is not found, the program outputs a message
    to that effect. Otherwise, the program outputs the number of times that this word occurs in the
    file and the position where it is first encountered (counting from position 0). The program should
    ignore case when it compares words
     */
    public static Map<String, Integer> searchWordInFile(String fileName, String word) throws Exception {
        String line;
        int count = 0;
        int position = 0;
        Map<String, Integer> map = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                int index = line.toLowerCase().indexOf(word.toLowerCase());
                if (index != -1) {
                    count++;
                    if (index < position || position == 0) {
                        position = index;
                    }
                }
            }
        } catch (IOException e) {
            throw new Exception(e);
        }
        map.put("wordCount", count);
        map.put("wordPosition", position);

        return map;
    }
}
