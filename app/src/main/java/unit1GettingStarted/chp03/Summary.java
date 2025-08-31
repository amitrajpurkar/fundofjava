package unit1GettingStarted.chp03;

import static unit1GettingStarted.Utils.printSeparator;
import static unit1GettingStarted.Utils.printSeparatorWithSpacing;

public class Summary {
    public static void main(String[] args) {
        printSeparator();
        System.out.println("Chapter 3: Syntax, Errors, Debugging");
        printSeparator();

        chapter3Summary();
        reviewKeyTerms();

    }

    private static void chapter3Summary() {
        printSeparatorWithSpacing();
        System.out.println("""
            * Java programs use the int data type for whole numbers (integers) and double for floating-point numbers (numbers with decimals).\n
            * Java variable and method names consist of a letter followed by additional letters or digits. Java keywords cannot be used as names\n
            * Final variables behave as constants; their values cannot change after they are declared.\n
            * Arithmetic expressions are evaluated according to precedence. Some expressions yield different results for integer and floating-point operands\n
            * Strings may be concatenated to form a new string\n
            * The compiler catches syntax errors. The JVM catches run-time errors. Logic errors, if they are caught, are detected by the programmer or user of the program at run time.\n
            * A useful way to find and remove logic errors is to insert debugging output statements to view the values of variables\n
            * Java uses a screen coordinate system to locate the positions of pixels in a window or panel. The origin of this system is in the upper-left corner or the drawing area, and the x and y axes increase to the right and downward, respectively\n
            * The programmer can modify the color with which images are drawn and the properties of text fonts for a given graphics object
            """);
        printSeparator();
    }

    private static void reviewKeyTerms() {
        printSeparatorWithSpacing();
        System.out.println("Review Key Terms");
        System.out.println("Arithmetic expression");
        System.out.println("Comments");
        System.out.println("Variable declaration statement");
        System.out.println("Semantics");
        System.out.println("Syntax");
        System.out.println("Keywords");
        System.out.println("Reserved words");
        System.out.println("Literal");
        System.out.println("Pseudocode");
        System.out.println("Virus");

        System.out.println("Logic error");
        System.out.println("Run-time error");
        System.out.println("Syntax error");
        System.out.println("Exception");
        
        System.out.println("Package");
        System.out.println("Method signature");

        System.out.println("Coordinate system");
        System.out.println("Graphics context");
        System.out.println("Screen coordinate system");
        
        printSeparator();
    }
}
