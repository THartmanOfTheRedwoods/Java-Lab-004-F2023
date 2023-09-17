import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
public static int square(int yes) {
    return yes * yes;
}
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
       int no = square(input);
        // Put the result System.out code here.
        System.out.println("square of " + input + "= " + no);
    }
}
