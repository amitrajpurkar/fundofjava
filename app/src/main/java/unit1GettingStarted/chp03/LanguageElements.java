package unit1GettingStarted.chp03;

import static unit1GettingStarted.Utils.printSeparator;
import static unit1GettingStarted.Utils.printSeparatorWithSpacing;

public class LanguageElements {
    public static void main(String[] args) {
        printSeparator();
        System.out.println("Chapter 3: Syntax, Errors, Debugging");
        printSeparator();

        printVocabularyList();
        programmingVsNaturalLanguage();

        printSeparatorWithSpacing();
        System.out.println("data type of 10 = "+dataTypeOf(10));
        System.out.println("data type of 12.5 = "+dataTypeOf(12.5));
        System.out.println("data type of true = "+dataTypeOf(true));
        System.out.println("data type of 'pingpong' = "+dataTypeOf("pingpong"));

        printSeparatorWithSpacing();
        System.out.println("Exponent format of 23.5 = "+doubleToExponential(23.5));
        System.out.println("Exponent format of 0.046 = "+doubleToExponential(0.046));
        System.out.println("double value for 32.21E4 = "+exponentialToDouble("32.21E4"));
        System.out.println("double value for 55.6E-3 = "+exponentialToDouble("55.6E-3"));

        System.out.println("\n\n\n\n");
    }

    private static void printVocabularyList() {
        printSeparatorWithSpacing();
        System.out.println("Language Elements = vocabulary, syntax, and semantics");
        System.out.println("\nVocabulary = ");
        System.out.println("\tKEYWORDS, \n\tIdentifiers (variables), \n\tLiterals (constants), \n\tOperators (arithmetic, assignment, logical, relational), \n\tDelimiters (separators), \n\tComments");
        System.out.println("\nSyntax = Syntax consists of the rules for combining words into sentences, or statements");
        System.out.println("\nSemantics = Semantics define the rules for interpreting the meaning of statements");
        printSeparator();
        
        
    }

    private static void programmingVsNaturalLanguage() {
        printSeparatorWithSpacing();
        System.out.println("Programming vs Natural Language");
        System.out.println("Programming Language = a language that is used to write computer programs");
        System.out.println("Natural Language = a language that is used to communicate with human beings");
        System.out.println("1. Size: Programming languages have small vocabulary, simple syntax and symantics");
        System.out.println("2. Rigidity: In Programming languages, syntax must be absolutely correct; rigid syntax, symantics");
        System.out.println("3. Literalness: we must be exhaustively thorough. Computers follow instructions in a very literal manner.");
        printSeparator();
    }

    /**
     * write a method that takes a primitive data and returns a string telling what data type it is
     */
    private static String dataTypeOf(Object obj) {
        return obj.getClass().getSimpleName();
    }

    private static String doubleToExponential(double d) {
        return String.format("%.3E", d);
    }

    private static double exponentialToDouble(String s) {
        return Double.parseDouble(s);
    }
}
