package unit1GettingStarted;

import java.util.Scanner;

/**
 * 1) Input N students and their 3 test scores. Output their name, tests and
 * average. Also, print the class average.
 * 2) In another class make static methods for find num!, determine odd or even
 * and determine prime, composite or neither. (Input is any integer)
 * 3) Put the menu in the main program including all 4 programs
 */
public class ProjectAug {
    public static void main(String[] args) {
        showMenu();
        String name;
        int a, b, c;

        int choice = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            do {
                switch (choice) {
                    case 1 -> {
                        System.out.println("How many students do you want to enter? ");
                        int n = scanner.nextInt();
                        for (int i=0; i < n; i++) {
                            System.out.print("Enter student name and three test scores: ");
                            name = scanner.next();
                            a = scanner.nextInt();
                            b = scanner.nextInt();
                            c = scanner.nextInt();
                            Student.addStudent(new Student(name, a, b, c));
                        }
                        System.out.println("Name\t\tTest 1\tTest 2\tTest 3\tAverage");
                        for (int i=0; i < n; i++) {
                            System.out.println(Student.studentList.get(i).getName() + "\t\t" +
                                    Student.studentList.get(i).getMathsScore() + "\t\t" +
                                    Student.studentList.get(i).getPhysicsScore() + "\t\t" +
                                    Student.studentList.get(i).getHistoryScore() + "\t\t" +
                                    Student.studentList.get(i).getAverageScore());
                        }
                        System.out.println("Class average is " + Student.averageAllScore());
                        System.out.println("Average maths score is " + Student.averageMathsScore());
                        System.out.println("Average physics score is " + Student.averagePhysicsScore());
                        System.out.println("Average history score is " + Student.averageHistoryScore());
                        System.out.println(Student.highestMathsScore());
                        System.out.println(Student.highestPhysicsScore());
                        System.out.println(Student.highestHistoryScore());
                    }
                    case 2 -> {
                        System.out.print("Enter a number: ");
                        int number = scanner.nextInt();
                        System.out.println("Factorial of " + number + " is " + Utils.findFactorial(number));
                    }
                    case 3 -> {
                        System.out.print("Enter a number: ");
                        int number1 = scanner.nextInt();
                        if (Utils.isOdd(number1)) {
                            System.out.println("The number is odd");
                        } else {
                            System.out.println("The number is even");
                        }
                    }
                    case 4 -> {
                        System.out.print("Enter a number: ");
                        int number2 = scanner.nextInt();
                        if ("Prime".equalsIgnoreCase(Utils.isPrime(number2))) {
                            System.out.println("The number is prime");
                        } else if ("Composite".equalsIgnoreCase(Utils.isPrime(number2))) {
                            System.out.println("The number is composite");
                        } else {
                            System.out.println("The number is neither prime nor composite");
                        }
                    }
                    case 5 -> System.out.println("you entered Exit");
                    default -> System.out.println("Invalid choice");
                }
                if (choice != 5) {
                    showMenu();
                    System.out.println("Enter your choice: ");
                    choice = scanner.nextInt();
                }
            } while (choice != 5);
        }
        System.out.println("Goodbye!");
    }

    private static void showMenu() {
        System.out.println("Choose from the following menu");
        System.out.println("1. students and scores");
        System.out.println("2. Find factorial");
        System.out.println("3. Find odd or even");
        System.out.println("4. determine prime, composite or neither");
        System.out.println("5. Exit ");
    }
}
