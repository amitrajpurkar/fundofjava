package unit2NextSteps.chp06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOfFour {
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
                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter student name and three test scores: ");
                            name = scanner.next();
                            a = scanner.nextInt();
                            b = scanner.nextInt();
                            c = scanner.nextInt();
                            Student student = new Student(name, a, b, c);
                            String validityCheck = student.validate();
                            if (!validityCheck.isEmpty()) {
                                System.out.println(validityCheck);
                            } else {
                                addStudent(student);
                            }
                        }
                        List<MenuOfFour.Student> sList = getStudents();
                        System.out.println("Name\t\tMaths\t\tPhysics\t\tHistory\t\tAverage");
                        for (int i = 0; i < n; i++) {
                            System.out.println(sList.get(i).getName() + "\t\t" +
                                    sList.get(i).getMathsScore() + "\t\t" +
                                    sList.get(i).getPhysicsScore() + "\t\t" +
                                    sList.get(i).getHistoryScore() + "\t\t" +
                                    sList.get(i).getAverageScore());
                        }
                        System.out.println("Class average is " + averageAllScore());
                        System.out.println("Average maths score is " + averageMathsScore());
                        System.out.println("Average physics score is " + averagePhysicsScore());
                        System.out.println("Average history score is " + averageHistoryScore());
                        System.out.println(highestMathsScore());
                        System.out.println(highestPhysicsScore());
                        System.out.println(highestHistoryScore());
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

    /**
     * static method to find factorial of a number, given an integer
     * 
     * @param n
     * @return
     */
    public static int findFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * static method to determine if a number is odd or even
     * 
     * @param n
     * @return
     */
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    /**
     * static method to determine if a number is prime or composite or neither
     * 
     * @param n
     * @return
     */
    public static String isPrime(int n) {
        if (n <= 1) {
            return "Neither";
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }

    private static class Student {
        String name;
        int mathsScore;
        int physicsScore;
        int historyScore;
        double averageScore;

        public Student(String name, int mathsScore, int physicsScore, int historyScore) {
            this.name = name;
            this.mathsScore = mathsScore;
            this.physicsScore = physicsScore;
            this.historyScore = historyScore;
            this.averageScore = (mathsScore + physicsScore + historyScore) / 3;
        }

        public String getName() {
            return name;
        }

        public int getMathsScore() {
            return mathsScore;
        }

        public int getPhysicsScore() {
            return physicsScore;
        }

        public int getHistoryScore() {
            return historyScore;
        }

        public double getAverageScore() {
            return averageScore;
        }

        public String validate() {
            StringBuilder message = new StringBuilder();
            if (name.isEmpty()) {
                message.append("Name cannot be empty; ");
            }
            if (mathsScore < 0 || mathsScore > 100) {
                message.append("Maths score must be between 0 and 100; value: ").append(mathsScore).append("; ");
            }
            if (physicsScore < 0 || physicsScore > 100) {
                message.append("Physics score must be between 0 and 100; value: ").append(physicsScore).append("; ");
            }
            if (historyScore < 0 || historyScore > 100) {
                message.append("History score must be between 0 and 100; value: ").append(historyScore).append("; ");
            }
            return message.toString();
        }
    }

        private static List<Student> studentList = new ArrayList<Student>();

    public static List<Student> getStudents(){
        return studentList;
    }

    public static void addStudent(Student student) {
        studentList.add(student);
    }
    public static void resetStudents() {
        studentList.clear();
    }
    public static int numberOfStudents() {
        return studentList.size();
    }
    public static double averageAllScore() {
        int total = 0;
        for (Student student : studentList) {
            total += student.mathsScore + student.physicsScore + student.historyScore;
        }
        return total / (studentList.size() * 3);
    }
    public static double averageMathsScore() {
        int total = 0;
        for (Student student : studentList) {
            total += student.mathsScore;
        }
        return total / studentList.size();
    }
    public static double averagePhysicsScore() {
        int total = 0;
        for (Student student : studentList) {
            total += student.physicsScore;
        }
        return total / studentList.size();
    }
    public static double averageHistoryScore() {
        int total = 0;
        for (Student student : studentList) {
            total += student.historyScore;
        }
        return total / studentList.size();
    }
    public static String highestMathsScore() {
        int highest = 0;
        String highestName = "";
        for (Student student : studentList) {
            if (student.mathsScore > highest) {
                highest = student.mathsScore;
                highestName = student.name;
            }
        }
        return "Highest Maths Score: " + highest + " by " + highestName;
    }
    public static String highestPhysicsScore() {
        int highest = 0;
        String highestName = "";
        for (Student student : studentList) {
            if (student.physicsScore > highest) {
                highest = student.physicsScore;
                highestName = student.name;
            }
        }
        return "Highest Physics Score: " + highest + " by " + highestName;
    }
    public static String highestHistoryScore() {
        int highest = 0;
        String highestName = "";
        for (Student student : studentList) {
            if (student.historyScore > highest) {
                highest = student.historyScore;
                highestName = student.name;
            }
        }
        return "Highest History Score: " + highest + " by " + highestName;
    }

}
