package unit1GettingStarted.chp02;

public class Project5 {
    public static void main(String[] args) {
        calculateMomentum(82.9, 15.7);
    }

    /**
     * an objects momentum is its mass multiplied by its velocity
     * write a program that takes as input an object's mass (in kg) and velocity (n m/s)
     * and prints its momentum
     */
    private static void calculateMomentum(Double mass, Double velocity) {
        Double momentum = mass * velocity;
        System.out.println("The momentum of the object is: "+momentum+" kg*m/s");
    }
}
