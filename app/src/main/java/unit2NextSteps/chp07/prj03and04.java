package unit2NextSteps.chp07;

import java.util.Scanner;

public class prj03and04 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        try (Scanner scanner = new Scanner(System.in)) {
            // scanner.useDelimiter("\n");

            String grade = scoreToGrade(scanner);
            System.out.println("Your grade is " + grade);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String scoreToGrade(Scanner scanner) {
        System.out.println("Enter your score: ");
        int score = scanner.nextInt();
        String grade = null;

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else {
            grade = getLetterGrade(score);
        }
        System.out.println("Your grade is " + grade);
        return grade;
    }

    public static void scoreUsingIf(Scanner scanner) {
        System.out.println("Enter your score: ");
        int score = scanner.nextInt();
        

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else if (score >= 96 && score <= 100) {
            System.out.println("Your grade is A+");
        } else if (score >= 92 && score <= 95) {
            System.out.println("Your grade is A");
        } else if (score >= 90 && score <= 91) {
            System.out.println("Your grade is A-");
        } else if (score >= 86 && score <= 89) {
            System.out.println("Your grade is B+");
        } else if (score >= 82 && score <= 85) {
            System.out.println("Your grade is B");
        } else if (score >= 80 && score <= 81) {
            System.out.println("Your grade is B-");
        } else if (score >= 76 && score <= 79) {
            System.out.println("Your grade is C+");
        } else if (score >= 72 && score <= 75) {
            System.out.println("Your grade is C");
        } else if (score >= 70 && score <= 71) {
            System.out.println("Your grade is C-");
        } else if (score >= 66 && score <= 69) {
            System.out.println("Your grade is D+");
        } else if (score >= 62 && score <= 65) {
            System.out.println("Your grade is D");
        } else if (score >= 60 && score <= 61) {
            System.out.println("Your grade is D-");
        } else {
            System.out.println("Your grade is F");
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
    // each grade has three attributes, minScore, maxScore, and letter
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
