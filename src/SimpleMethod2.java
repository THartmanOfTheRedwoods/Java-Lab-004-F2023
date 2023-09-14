import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int userInput) {
        return userInput * userInput;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        int number2 = square(userInput);
        // Put the result System.out code here.
        System.out.println(number2);
    }
}
