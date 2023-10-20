/**
 *
 * @author Trevor Hartman
 * @author Angelina Perez
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int number){
        return number * number;
    }

    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an integer that will be squared");
        // Modify the below call to assign the result of the method call to a variable.
        int input = scanner.nextInt();
        int result = square(input);
        // Put the result System.out code here.
        System.out.println(result);

    }
}
