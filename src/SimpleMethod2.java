import java.util.Scanner;

/**
 * @author Trevor Hartman
 * @author Trevor Hartman
 *
 * @since Version 1.0
 */
public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int sqr(int x){
        return x * x;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        System.out.println("enter a number you want to square");
        Scanner yourX = new Scanner(System.in);
        // Modify the below call to assign the result of the method call to a variable.
        int answer = yourX.nextInt();
        System.out.println(sqr(answer));


        // Put the result System.out code here.
    }
}
