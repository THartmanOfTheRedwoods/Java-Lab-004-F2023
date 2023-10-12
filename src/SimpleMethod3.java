import java.util.Scanner;

public class SimpleMethod3 {

    /**
     * Squares an integer value
     * @author Atticus Blanco
     * @param userInt
     * @return numSquared
     */
    public static int square(int userInt) {
            int numSquared = userInt * userInt;
            return numSquared;
    }

    /**
     * Squares a double value
     * @author Atticus Blanco
     * @param userDouble
     * @return numSquared
     */
    public static double square(double userDouble) {
        double numSquared = userDouble * userDouble;
        return numSquared;
    }

    /**
     * Prompts user for integer value, squares it and prints product to terminal.
     * Then prompts user for double value, squares it and prints product to terminal.
     * @author Atticus Blanco
     * @throws NumberFormatException If the user enters an invalid integer
     * @see SimpleMethod3#square(int)
     * @see SimpleMethod3#square(double)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to square: ");
        /* Integers Used */
        int input = Integer.valueOf(scanner.nextLine());
        int result = square(input);
        System.out.printf("The square of %d is %d%n", input, result);

        System.out.print("What number would you like to square: ");
        /* Doubles used  */
        double input2 = Double.valueOf(scanner.nextLine());
        double result2 = square(input2);
        System.out.printf("The square of %f is %f%n", input2, result2);
    }
}