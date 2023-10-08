import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int getSquare(int square){
        return square * square;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner t = new Scanner(System.in);
        // Modify the below call to assign the result of the method call to a variable.
        int input = t.nextInt();
        getSquare(input);
        // Put the result System.out code here.
        int square = input;
        System.out.println(getSquare(square));
    }
}