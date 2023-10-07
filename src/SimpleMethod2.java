import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give integer: ");
         int input = scanner.nextInt();
         
        // Modify the below call to assign the result of the method call to a variable.
        int inputsq = SimpleMethod.square(input);
        // Put the result System.out code here.
        System.out.println("Square of " + input + " is: " + inputsq);
        scanner.close();
    }
}
