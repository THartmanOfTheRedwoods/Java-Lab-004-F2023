import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int input) {
        return input * input;
    }


    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner integer = new Scanner(System.in);
        int input = integer.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        int i = square(input);
        // Put the result System.out code here.
        System.out.println(i);
    }
}
