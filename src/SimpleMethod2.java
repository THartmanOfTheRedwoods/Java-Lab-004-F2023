import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int num) {
        return num * num;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int integer = scanner.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        int result = square(integer);
        // Put the result System.out code here.
        System.out.println(result);
    }
}