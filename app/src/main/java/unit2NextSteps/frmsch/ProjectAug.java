package unit2NextSteps.frmsch;

import java.util.List;
import java.util.Scanner;

import unit2NextSteps.frmsch.Student.StuBuilder;

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
                            Student student = new StuBuilder(name).maths(a).physics(b).history(c).build(); 
                            String validityCheck = student.validate();
                            if (!validityCheck.isEmpty()) {
                                System.out.println(validityCheck);
                            } else {
                                Students.addStudent(student);
                            }
                        }
                        List<Student> sList = Students.getStudents();
                        System.out.println("Name\t\tMaths\t\tPhysics\t\tHistory\t\tAverage");
                        for (int i=0; i < n; i++) {
                            System.out.println(sList.get(i).getName() + "\t\t" +
                                    sList.get(i).getMathsScore() + "\t\t" +
                                    sList.get(i).getPhysicsScore() + "\t\t" +
                                    sList.get(i).getHistoryScore() + "\t\t" +
                                    sList.get(i).getAverageScore());
                        }
                        System.out.println("Class average is " + Students.averageAllScore());
                        System.out.println("Average maths score is " + Students.averageMathsScore());
                        System.out.println("Average physics score is " + Students.averagePhysicsScore());
                        System.out.println("Average history score is " + Students.averageHistoryScore());
                        System.out.println(Students.highestMathsScore());
                        System.out.println(Students.highestPhysicsScore());
                        System.out.println(Students.highestHistoryScore());
                    }
                    case 2 -> {
                        System.out.print("Enter a number: ");
                        int number = scanner.nextInt();
                        System.out.println("Factorial of " + number + " is " + Helper.findFactorial(number));
                    }
                    case 3 -> {
                        System.out.print("Enter a number: ");
                        int number1 = scanner.nextInt();
                        if (Helper.isOdd(number1)) {
                            System.out.println("The number is odd");
                        } else {
                            System.out.println("The number is even");
                        }
                    }
                    case 4 -> {
                        System.out.print("Enter a number: ");
                        int number2 = scanner.nextInt();
                        if ("Prime".equalsIgnoreCase(Helper.isPrime(number2))) {
                            System.out.println("The number is prime");
                        } else if ("Composite".equalsIgnoreCase(Helper.isPrime(number2))) {
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
        System.out.println("\n\n\n\n---------------------");
        System.out.println("Choose from the following menu");
        System.out.println("1. students and scores");
        System.out.println("2. Find factorial");
        System.out.println("3. Find odd or even");
        System.out.println("4. determine prime, composite or neither");
        System.out.println("5. Exit ");
    }
}
