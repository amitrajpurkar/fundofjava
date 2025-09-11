package unit2NextSteps.chp07;

import java.util.Scanner;

public class prj03 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static void scoreToGrade(){
        try(Scanner scanner = new Scanner(System.in)) {
            scanner.useDelimiter("\n");

            System.out.println("Enter your score: ");
            int score = scanner.nextInt();
            String grade = null;

            if (score < 0 || score > 100) {
                System.out.println("Invalid score");
            } else {
                grade = getLetterGrade(score);
            }
            System.out.println("Your grade is " + grade);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static String getLetterGrade(int score) {
        String grade = null;
        for (Grade g : Grade.values()) {
            if (score >= g.minScore && score <= g.maxScore) {
                grade = g.letter;
            }
        }
        return grade;
    }

    
    // define enum for grade
    //each grade has three attributes, minScore, maxScore, and letter
    public enum Grade {
        Aplus(96, 100, "A+"),
        A(92, 95, "A"),
        Aminus(90, 91, "A-"),
        Bplus(86, 89, "B+"),
        B(82, 85, "B"),
        Bminus(80, 81, "B-"),
        Cplus(76, 79, "C+"),
        C(72, 75, "C"),
        Cminus(70, 71, "C-"),
        Dplus(66, 69, "D+"),
        D(62, 65, "D"),
        Dminus(60, 61, "D-"),
        F(0, 59, "F");

        int minScore, maxScore; 
        String letter;


        Grade(int i, int j, String string) {
            this.minScore = i;
            this.maxScore = j;
            this.letter = string;
        }
    }
}
