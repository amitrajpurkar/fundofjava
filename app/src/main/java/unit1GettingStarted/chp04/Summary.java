package unit1GettingStarted.chp04;

import static unit1GettingStarted.Utils.printSeparator;
import static unit1GettingStarted.Utils.printSeparatorWithSpacing;

public class Summary {
    public static void main(String[] args) {
        printSeparator();
        System.out.println("Chapter 4: Control Structures");
        printSeparator();

        summary();
        reviewKeyTerms();
    }

    private static void summary() {
        printSeparatorWithSpacing();
        System.out.println("Summary");
        System.out.println("""
            1. Java has some useful operators for extended assignment, such as +=, and for increment and decrement\n
            2. The Math class provides several useful methods, such as sqrt and abs\n
            3. The Random class allows you to generate random integers and floating-point numbers\n
            4. if and if-else statements are used to make one-way and two-way decisions\n
            5. The comparison operators, such as ==, <=, and >=, return Boolean values that serve as conditions of control statements\n
            6. The while loop allows the program to run a set of statements repeatedly until a condition becomes false\n
            7. The for loop is a more concise version of the while loop\n
            8. Other control statements, such as an if statement, can be nested within loops. A break statement can be used in conjunction with an if statement to terminate a loop early\n
            9. There are many kinds of logic errors that can occur in loops. Examples are the off-by-one error and the infinite loop
            """);
        printSeparator();
    }   

    private static void reviewKeyTerms() {
        printSeparatorWithSpacing();
        System.out.println("Review Key Terms");
        System.out.println("Control statements: statement that controls the flow of a program, eg if, if-else, while, for");
        System.out.println("Counter -- a variable that is incremented or decremented in a loop");
        System.out.println("Count-controlled loop -- a loop that executes a set of statements a fixed number of times");
        System.out.println("Entry-controlled loop -- a loop that executes a set of statements until a condition becomes false");
        System.out.println("Flowchart -- a diagram that shows the control flow of a program");
        System.out.println("Infinite loop -- a loop that never ends");
        System.out.println("Iteration -- the process of repeating a set of statements over and over again");
        System.out.println("Off-by-one error -- a logic error that occurs when a program executes a set of statements an incorrect number of times");
        System.out.println("Overloading -- a feature that allows a class to have multiple methods with the same name but different parameters");
        System.out.println("Random number generator -- this is a mechanism that returns numbers chosen at random from a predesignated interval; in Java this is implemented in the Random class; it has methods nextInt() and nextDouble()");
        System.out.println("Sentinel -- a value that signals the end of a loop");
        System.out.println("Task-controlled loop -- a loop that executes a set of statements until a condition becomes true");
        printSeparator();
    }
}
