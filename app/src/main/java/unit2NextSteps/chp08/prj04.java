package unit2NextSteps.chp08;

public class prj04 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        callPaymentSchedule();
    }

    public static void callPaymentSchedule() {
        
        System.out.println("Enter the purchase price: ");
        double purchasePrice = Double.parseDouble(System.console().readLine());
        printLifetimePaymentSchedule(purchasePrice);
    }

    /**
     * The TidBit Computer Store has a credit plan for computer purchases. There is a 10 percent
down payment and an annual interest rate of 12 percent. Monthly payments are 5 percent of the
listed purchase price minus the down payment. Write a program that takes the purchase price as
input. The program should display a table of the payment schedule for the lifetime of the loan.
Use appropriate headers. Each row of the table should contain the following items:
■ Month number (beginning with 1)
■ Current total balance owed
■ Interest owed for that month
■ Amount of principal owed for that month
■ Payment for that month
■ Balance remaining after payment
The amount of interest for a month is equal to balance * rate / 12. The amount of principal
for a month is equal to the monthly payment minus the interest owed for that month.
     */
    public static void printLifetimePaymentSchedule(double purchasePrice) {
        //todo
        String[] columnNames = {"Month", "Total Balance", "Interest", "Principal", "Payment", "Balance"};
        String[][] data = new String[12][columnNames.length];

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

        for (int i = 0; i < 12; i++) {
            data[i][0] = String.valueOf(i + 1);
            data[i][1] = String.valueOf(purchasePrice);
            data[i][2] = String.valueOf(purchasePrice * 0.12 / 12);
            data[i][3] = String.valueOf(purchasePrice * 0.05 - purchasePrice * 0.12 / 12);
            data[i][4] = String.valueOf(purchasePrice * 0.05);
            data[i][5] = String.valueOf(purchasePrice - purchasePrice * 0.05);
            purchasePrice = purchasePrice - purchasePrice * 0.05;
            for (String datum : data[i]) {
                System.out.printf("%-" + 20 + "s", datum);
            }
            System.out.println("");
        }
    }
}
