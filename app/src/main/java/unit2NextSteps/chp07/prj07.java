package unit2NextSteps.chp07;

public class prp07 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        printPerimeterAndAreaOfRectangles();
    }

    /**
    Write a program to print the perimeter and area of rectangles using all combinations of
    heights and widths running from 1 foot to 10 feet in increments of 1 foot. Print the output in
    headed, formatted columns
     */
    public static void printPerimeterAndAreaOfRectangles() {
        //todo
        String headers[] = {"Height (feet)", "Width (feet)", "Perimeter (feet)", "Area (feet^2)"};
        //column widths
        int[] columnWidths = {15, 15, 20, 30};

        //print headers
        for (int i = 0; i < headers.length; i++) {
            System.out.printf("%-" + columnWidths[i] + "s", headers[i]);
        }
        System.out.println("");
        //print separator
        for (int i = 0; i < headers.length; i++) {
            System.out.print("-".repeat(columnWidths[i]));
        }
        System.out.println("");

        for (int height = 1; height <= 10; height++) {         
            for (int width = 1; width <= 10; width++) {     
                System.out.printf("%-" + columnWidths[0] + "s", height);
                System.out.printf("%-" + columnWidths[1] + "s", width);
                System.out.printf("%-" + columnWidths[2] + "s", 2 * (height + width));
                System.out.printf("%-" + columnWidths[3] + "s", height * width);
                System.out.println("");
            }
        }
    }
}
