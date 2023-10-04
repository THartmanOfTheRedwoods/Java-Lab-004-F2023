import java.util.Scanner;
    public class SimpleMethod2 {
        // The square() method takes 1 integer, squares it, and returns the integer result of the square.
        public static int square(int number) {
          return number * number;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Put scanner code to get integer input here
            System.out.print("Enter an integer: "); // Prompt the user to enter an integer
            int inputNumber = scanner.nextInt(); // Read an integer from the user
            int squaredResult = square(inputNumber);
            System.out.println("The square of " + inputNumber + " is " + squaredResult);
        }
    }
