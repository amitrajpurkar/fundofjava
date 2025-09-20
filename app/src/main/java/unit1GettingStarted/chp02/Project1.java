package unit1GettingStarted.chp02;

public class Project1 {
    public static void main(String[] args) {
        printNameAddressPhone();
    }

    public static void runProject() {
        printNameAddressPhone();
    }

    private static void printNameAddressPhone() {
        System.out.println("Project 1: print Name Address Phone; without inputs");
        System.out.println("""
                Name: Dhruv
                Address: 123 Main Street, Jacksonville, Florida 32216
                Phone: 123-456-7890
        """);
    }

}
