package unit1GettingStarted.chp02;


public class Project4 {
    public static void main(String[] args) {
        printMinutesInYear();
    }
    
    /**
     * write a program that prints the number of minutes in a year
     */
    public static void printMinutesInYear() {
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int minutesInYear = minutesInHour * hoursInDay * daysInYear;
        System.out.println(minutesInYear);
    }
}
