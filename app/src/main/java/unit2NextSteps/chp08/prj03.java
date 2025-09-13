package unit2NextSteps.chp08;

import java.util.Scanner;

public class prj03 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        callMutualFundPlan();
    }

    public static void callMutualFundPlan() {
        try(Scanner scanner = new Scanner(System.in)) {
            scanner.useDelimiter("\n");

            System.out.println("Enter the interest rate: ");
            double interestRate = scanner.nextDouble();
            System.out.println("Enter the initial principal: ");
            double principal = scanner.nextDouble();
            System.out.println("Enter the number of years: ");
            int years = scanner.nextInt();
            showMutualFundPlan(interestRate, principal, years);
        } catch (Exception e) {
        }
        
    }

    /**
    John has $500 to invest. Sue knows of a mutual fund plan that pays 10 percent interest, com-
    pounded quarterly (that is, every 3 months, the principal is multiplied by the 2.5 percent and the
    result is added to the principal; more generally, the amount of gain each quarter is equal to cur-
    rent balance * (1 + interest rate / 400)). Write a program that tells John how much money will be
    in the fund after 20 years. Make the program general; that is, it should take as inputs the interest
    rate, the initial principal, and the number of years to stay in the fund. The output should be a
    table whose columns are the year number, the principal at the beginning of the year, the interest
    earned, and the principal at the end of the year
     */
    public static void showMutualFundPlan(double interestRate, double principal, int years) {
        //todo
        String[] columnNames = {"Year", "Initial Principal", "Interest", "End Principal"};
        String[][] data = new String[years][columnNames.length];

        //print headers
        for (String columnName : columnNames) {
            System.out.printf("%-" + 20 + "s", columnName);
        }
        System.out.println("");
        //print separator
        for (int i = 0; i < columnNames.length; i++) {
            System.out.print("-".repeat(20));
        }
        System.out.println("");

        for (int i = 0; i < years; i++) {
            data[i][0] = String.valueOf(i + 1);
            data[i][1] = String.valueOf(principal);
            data[i][2] = String.valueOf(principal * interestRate / 400);
            principal += principal * interestRate / 400;
            data[i][3] = String.valueOf(principal);

            for (int j = 0; j < columnNames.length; j++) {
                System.out.printf("%-" + 20 + "s", data[i][j]);
            }
            System.out.println("");
        }

    }
}
