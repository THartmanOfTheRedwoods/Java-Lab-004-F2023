import java.util.Scanner;
public class SimpleMethod3 {
    // Put your method code here
    public static int square(int number) {
        return (int) Math.pow(number,2);
    }







    public static double square(double number) {
        // Put your code here
        return Math.pow(number,2);
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

