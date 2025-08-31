package unit2NextSteps.chp06;

import static unit1GettingStarted.Utils.printSeparator;
import static unit1GettingStarted.Utils.printSeparatorWithSpacing;

public class Summary {
    public static void main(String[] args) {
        printSeparator();
        System.out.println("Chapter 6: Introduction to Classes");
        printSeparator();

        summary();
        keyTerms();
    }

    public static void summary() {
        printSeparatorWithSpacing();
        System.out.println("Summary: Chapter 6: Introduction to Classes");
        System.out.println("""
                1. Java class definitions consist of instance variables, constructors, and methods\n
                2. Constructors initialize an object's instance variables when the object is created. A default constructor expects no parameters and sets the variables to reasonable default values. Other constructors expect parameters that allow clients to set up objects with specified data\n
                3. Mutator methods modify an object's instance variables, whereas accessor methods merely allow clients to observe the values of these variables\n
                4. The visibility modifier public is used to make methods visible to clients, whereas the visibility modifier private is used to encapsulate or restrict access to variables and methods\n
                5. Helper methods are methods that are called from other methods in a class definition. They are usually declared to be private\n
                6. Variables within a class definition can be instance variables, local variables, or parameters. Instance variables are used to track the state of an object. Local variables are used for temporary working storage within a method. Parameters are used to transmit data to a method\n
                7. A formal parameter appears in a method’s signature and is referenced in its code. An actual parameter is a value passed to a method when it is called. A method’s actual parameters must match its formal parameters in number, position, and type\ns
                8. The scope of a variable is the area of program text within which it is visible. The scope of an instance variable is the entire class within which it is declared. The scope of a local variable or a parameter is the body of the method within which it is declared\n\
                9. The lifetime of a variable is the period of program execution during which its storage can be accessed. The lifetime of an instance variable is the same as the lifetime of a particular object. The lifetime of a local variable and a parameter is the time during which a particular call of a method is active\n
         """);
        printSeparator();
    }

    public static void keyTerms() {
        System.out.println("Accessor -- a method that returns the value of a private attribute; also known as getter methods");
        System.out.println("Mutator -- a method that changes the value of a private attribute; also known as setter methods");
        System.out.println("Actual parameter -- a value passed to a method when it is called");
        System.out.println("Behavior -- the behavior of an object, which is the set of actions that it performs");
        System.out.println("Constructor -- a method that is called when an object is created");
        System.out.println("Encapsulation -- the process of bundling data and methods that work on that data into a single unit called a class");
        System.out.println("Formal parameter -- a value passed to a method when it is called");
        System.out.println("Helper method -- a method that is called from other methods in a class definition");
        System.out.println("Identity -- the identity of an object, which is its address in memory");
        System.out.println("Instantiation -- the process of creating a new object of a class");
        System.out.println("Lifetime -- the period of program execution during which a variable can be accessed");
        System.out.println("Scope -- the area of program text within which a variable is visible");
        System.out.println("State -- the state of an object, which is the values of its instance variables");
        System.out.println("Visibility modifier -- the visibility modifier public is used to make methods visible to clients, whereas the visibility modifier private is used to encapsulate or restrict access to variables and methods");
    }
}
