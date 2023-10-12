import java.util.Scanner;

public class SimpleMethod3 {

    public static int square(int userInt) {
            int numSquared = userInt * userInt;
            return numSquared;
    }

    public static double square(double userDouble) {
        double numSquared = userDouble * userDouble;
        return numSquared;
    }

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