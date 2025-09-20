package unit2NextSteps.chp06;

public final class Helper {
    
    /**
     * static method to find factorial of a number, given an integer
     * @param n
     * @return
     */
    public static int findFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * static method to determine if a number is odd or even
     * @param n
     * @return
     */
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    /**
     * static method to determine if a number is prime or composite or neither
     * @param n
     * @return
     */
    public static String isPrime(int n) {
        if (n <= 1) {
            return "Neither";
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }
        
}
