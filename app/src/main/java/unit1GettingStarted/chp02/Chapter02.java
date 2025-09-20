package unit1GettingStarted.chp02;

import org.example.Chapter;

import static unit1GettingStarted.Utils.printSeparator;
import static unit1GettingStarted.Utils.printSeparatorWithSpacing;

public class Chapter02  {
    // implements Chapter... not sure of usage
    public static void summaryOfChapter2() {
        advantagesThanCpp();
        osAndIdes();
        programConstituents();
        threeBasicSteps();
        sequenceFromCodeToExecute();

        readability();
    }

    //@Override
    public static void getSummary() {
        advantagesThanCpp();
        osAndIdes();
        programConstituents();
        threeBasicSteps();
        sequenceFromCodeToExecute();

        readability();
    }

    private static void readability() {
        printSeparatorWithSpacing();
        System.out.println("READABILITY OF CODE and its SIGNIFICANCE");
        System.out.println("\n1. programs have long life; it can be lengthy and complex");
        System.out.println("\n2. programs are maintained by many developers, besides original authors");
        System.out.println("\n3. maintainability is directly proportional to READABILITY of code");
        System.out.println("\n4. Once READABLE, one can understand features and complexity of code");
        System.out.println("\n5. READABILITY includes Layout, Spacing, Indentation, Comments, etc");
        System.out.println("\n6. READABILITY of code is very important");
        printSeparator();
    }

    private static void threeBasicSteps() {
        printSeparatorWithSpacing();
        System.out.println("Three Basic Steps in Code development ");
        System.out.println("EDIT -> COMPILE -> EXECUTE using IDE");
        printSeparator();
    }

    private static void sequenceFromCodeToExecute() {
        printSeparatorWithSpacing();
        System.out.println("Flow of steps in Code development till execution");
        System.out.println("\n1. Edit Code in Text Editor/ IDE... SourceCode.java");
        System.out.println("\n2. Compile Java Source Code... javac SourceCode.java gives you SourceCode.class file.. this is bytecode or pseudo machinecode");
        System.out.println("\n3. JVM, Java Virtual Machine, will interpret bytecode into machine code... java SourceCode");
        System.out.println("\n4. JVM runs on any machine, any operating system.. so the computer executes the code... shows the output...");
        System.out.println("\n4a. we also say that JVM executes the code... Java's Portability = Write Once, Run Anywhere..");
        printSeparator();
    }

    private static void advantagesThanCpp(){
        printSeparatorWithSpacing();
        System.out.println("Advantages of Java over C++ ");
        System.out.println("\n1. Java code is Secure");
        System.out.println("\n2. Java is platform independent / Portability/ Write Once, Run Anywhere");
        System.out.println("\n3. Java is Robust/ avoids memory leaks");
        System.out.println("\n4. Java is object oriented/ similar to C++");
        System.out.println("\n5. Java on other hand is slow in comparison to C++ and needs more memory/ CPU power");
        printSeparator();
    }

    private static void osAndIdes(){
        printSeparatorWithSpacing();
        System.out.println("Operating System and IDEs");
        System.out.println("\n1. Windows -- DOS development environment... Notepad");
        System.out.println("\n2. Linux, Unix -- Terminal development environment... Vim");
        System.out.println("\n3. MacOS -- Terminal development environment... Eclipse, NetBeans, IntelliJ");
        System.out.println("\n4. Android -- Terminal development environment... Android Studio");
        System.out.println("\n5. Web -- Terminal development environment... Visual Studio Code");
        printSeparator();
    }

    private static void programConstituents(){
        printSeparatorWithSpacing();
        System.out.println("Program Constituents");
        System.out.println("\n1. Variables, Constants, Objects, Methods, Classes, Interfaces, and Packages");
        System.out.println("\n2. Arithmetic Expressions, Relational Expressions, Logical Expressions");
        System.out.println("\n3. Objects, Methods, and Parameters");
        printSeparator();
    }
}
