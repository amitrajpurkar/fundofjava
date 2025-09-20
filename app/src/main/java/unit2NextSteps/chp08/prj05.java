package unit2NextSteps.chp08;

import java.util.Scanner;

public class prj05 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        temperatureConversion();
    }

    public static void temperatureConversion() {
        Scanner reader = new Scanner(System.in);
        Thermometer thermo = new Thermometer();
        String doItAgain = "y";
        while (doItAgain.equalsIgnoreCase("y")) {
            // Nested loop until input number is well-formed
            while (true)
                try {
                    // Attempt statements that might throw exceptions
                    System.out.print("\nEnter degrees Fahrenheit:");
                    thermo.setFahrenheit(reader.nextDouble());
                    break;
                } catch (Exception e) {
                    // Code for error recovery
                    System.out.println("Error in number format!");
                    // Consume the trailing newline due to bad input
                    reader.nextLine();
                }
            System.out.println("The equivalent in Celsius is " + thermo.getCelsius());
            System.out.print("\nDo it again(y/n)?");
            // Consume the trailing end of line
            reader.nextLine();
            doItAgain = reader.nextLine();
        }
    }

    public static class Thermometer {
        private double fahrenheit;
        private double celsius;

        public void setFahrenheit(double fahrenheit) {
            this.fahrenheit = fahrenheit;
            celsius = (fahrenheit - 32) * 5 / 9;
            //format number to nearest hundreth
            celsius = Math.round(celsius * 100) / 100.0;
        }

        public void setCelsius(double celsius) {
            this.celsius = celsius;
            fahrenheit = celsius * 9 / 5 + 32;
            //format number to nearest hundreth
            fahrenheit = Math.round(fahrenheit * 100) / 100.0;
        }

        public double getFahrenheit() {
            return fahrenheit;
        }

        public double getCelsius() {
            return celsius;
        }
    }
}
