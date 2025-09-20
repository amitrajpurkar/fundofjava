package unit1GettingStarted.chp03;

import static unit1GettingStarted.Utils.printSeparator;
import static unit1GettingStarted.Utils.printSeparatorWithSpacing;

public class Chapter03 {
    public static void main(String[] args) {
        printSeparator();
        System.out.println("Chapter 3: Syntax, Errors, Debugging");
        printSeparator();

        getSummary();
        

    }

    public static void getSummary() {
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
        reviewKeyTerms();
    }

    private static void reviewKeyTerms() {
        printSeparatorWithSpacing();
        System.out.println("KEY TERMS");
        System.out.println("""
            Arithmetic expression
            Comments
            Variable declaration statement
            Semantics
            Syntax
            Keywords eg if, while, for
            Reserved words eg int, double
            Literal
            Pseudocode
            Virus

            Logic error
            Run-time error
            Syntax error
            Exception

            Package
            Method signature

            Coordinate system
            Graphics context
            Screen coordinate system
        """); 
        printSeparator();
    }
}
