import java.util.Scanner;

public class SimpleMethod3 {

    /*
    NOTE: You can create multiple methods with the same name and different return
          types or parameters (Overloading methods).
          Overloaded methods can even call each-other, but you'll have to type
          the arguments correctly and cast upon return.
     */
    public static int square(int num) {
        // Put your code here
        return num * num;
    }

    public static double square(double num) {
        // Put your code here
        return num * num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to square: ");
        /* Integers Used */
        int input = (scanner.nextInt());
        int result = square(input);
        System.out.printf("The square of %d is %d%n", input, result);

        System.out.print("What number would you like to square: ");
        /* Doubles used  */
        double input2 = (scanner.nextDouble());
        double result2 = square(input2);
        System.out.printf("The square of %f is %f%n", input2, result2);
    }
}