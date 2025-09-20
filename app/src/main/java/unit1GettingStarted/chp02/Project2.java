package unit1GettingStarted.chp02;

public class Project2 {
    public static void main(String[] args) {
        printHollowTrianglePattern(10);

        printTrianglePattern(10);
    }

    public static void printHollowTrianglePattern(int n) {
        System.out.println("Hollow Triangle Pattern");
        String word = "YIELD";
        String lineAccumulator = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                lineAccumulator += " ";
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    lineAccumulator += "*";
                } else {
                    lineAccumulator += " ";
                }
            }
            if(lengthAfterStar(lineAccumulator) == word.length()+6){
                lineAccumulator = replaceWithWord(lineAccumulator, word);
            }
            System.out.print(lineAccumulator);
            lineAccumulator = "";
            System.out.println();
        }
    }

    private static int lengthAfterStar(String wordWithStar) {
        char starChar = '*';
        int position = wordWithStar.indexOf(starChar);
        String portionFromStar = wordWithStar.substring(position);
        return portionFromStar.length();
    }

    private static String replaceWithWord(String wordWithStar, String word) {
        char starChar = '*';
        int position = wordWithStar.indexOf(starChar);
        String startString = wordWithStar.substring(0,position);
        return startString +"*  " + word + "  *";
    }

    public static void printTrianglePattern(int n) {
        System.out.println("Triangle Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
