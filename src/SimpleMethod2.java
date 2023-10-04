import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int x){
        return x * x;

    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to have squared: ");
        int input = Integer.parseInt(s.nextLine());
        // Modify the below call to assign the result of the method call to a variable.
        int result = square(input);
        // Put the result System.out code here.
        System.out.printf("The square of %d is %d%n", input, result);
    }
}
