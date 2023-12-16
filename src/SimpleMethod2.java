import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int number) {
        return number * number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        // Get the input from the user
        int input = scanner.nextInt();

        // Call the square method and assign the result to a variable
        int result = square(input);

        // Print the result
        System.out.println("The square of " + input + " is: " + result);
    }
}
