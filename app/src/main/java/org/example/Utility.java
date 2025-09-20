package org.example;

import java.util.Scanner;

import unit1GettingStarted.chp01.Chapter01;
import unit1GettingStarted.chp02.Chapter02;
import unit1GettingStarted.chp02.Project1;
import unit1GettingStarted.chp02.Project2;
import unit1GettingStarted.chp02.Project3;
import unit1GettingStarted.chp02.Project4;
import unit1GettingStarted.chp02.Project5;
import unit1GettingStarted.chp03.Chapter03;
import unit1GettingStarted.chp04.Chapter04;
import unit1GettingStarted.chp05.Chapter05;
import unit2NextSteps.chp06.Chapter06;
import unit2NextSteps.chp06.ProjectAug;

public class Utility {

    public static void showUnits() {
        System.out.println("""
                    1. Getting Started
                    2. Next Steps
                    3. Arrays and Classes
                    4. Advanced Topics
                    5. Exit
                """);
    }

    public static void showChapters(int unitNumber) {
        switch (unitNumber) {
            case 1 -> {
                System.out.println("""
                            1. Chapter 1 - Background
                            2. Chapter 2 - First Java Programs
                            3. Chapter 3 - Syntax, Errors, Debugging
                            4. Chapter 4 - Introduction to Control Structures
                            5. Chapter 5 - Using Classes and Objects in Media Computing
                            0. Back to Units
                        """);
            }
            case 2 -> {
                System.out.println("""
                            6. Chapter 6 - Introduction to Classes
                            7. Chapter 7 - Control Structures Continued
                            8. Chapter 8 - Improving User Interfaces
                            9. Chapter 9 - Introduction to HTML and Java Applets
                            0. Back to Units
                        """);
            }
            case 3 -> {
                System.out.println("""
                            10. Chapter 10 - Introduction to Arrays
                            11. Chapter 11 - Classes continued
                            12. Chapter 12 - Arrays continued
                            0. Back to Units
                        """);
            }
            case 4 -> {
                System.out.println("""
                            13. Chapter 13 - Recursion, Complexity, Searching, Sorting
                            14. Chapter 14 - Introduction to Collections
                            15. Chapter 15 - Multi Threading, Networks, Client/Server
                            0. Back to Units
                        """);
            }
            default -> {
                System.out.println("Invalid unit number");
            }
        }
    }

    public static void showChapterContents(int chapter) {
        switch (chapter) {
            case 1 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 2 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 3 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 4 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 5 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 6 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 7 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 8 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 9 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 10 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 11 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 12 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 13 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 14 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            case 15 -> {
                System.out.println("""
                            summ: Display Chapter Summary
                            prj1: Display Key Terms
                            prj2: xxx
                            prj3: xxx
                            back: Back to Units
                        """);
            }
            default -> {
                System.out.println("Invalid chapter number");
            }
        }
    }

    public static void runProjectOrSummary(int chapter, String projOrSumm, Scanner scanner) {
        switch (chapter) {
            case 1 -> {
                switch (projOrSumm) {
                    case "summ" -> Chapter01.getSummary();
                }
            }
            case 2 -> {
                switch (projOrSumm) {
                    case "summ" -> Chapter02.getSummary();
                    case "prj1" -> Project1.runProject();
                    case "prj2a" -> Project2.printTrianglePattern(10);
                    case "prj2b" -> Project2.printHollowTrianglePattern(10);
                    case "prj3" -> Project3.convertKilometersToNauticalMiles(scanner);
                    case "prj4" -> Project4.printMinutesInYear();
                    case "prj5" -> Project5.calculateMomentum(84.2, 15.7);
                }
            }
            case 3 -> {
                switch (projOrSumm) {
                    case "summ" -> Chapter03.getSummary();
                }
            }
            case 4 -> {
                switch (projOrSumm) {
                    case "summ" -> Chapter04.getSummary();
                }
            }
            case 5 -> {
                switch (projOrSumm) {
                    case "summ" -> Chapter05.getSummary();
                }
            }
            case 6 -> {
                switch (projOrSumm) {
                    case "summ" -> Chapter06.getSummary();
                    case "prj1" -> ProjectAug.runProject();
                }
            }
        }
    }
}
