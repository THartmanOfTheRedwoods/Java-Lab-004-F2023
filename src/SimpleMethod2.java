import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int number) {
            int result = number * number;
    return result; }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Put scanner code to get integer input here
        // Modify the below call to assign the result of the method call to a variable.
       System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        int squaredValue = square(input);

        SimpleMethod.square(input);
        // Put the result System.out code here.
        System.out.println(" The squeare of " + input + "is: " + squaredValue);

    }
}
