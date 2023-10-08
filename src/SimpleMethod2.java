import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int freefall){
        return freefall * freefall;
    }

    public static void main(String[] args) {
        // Put scanner code to get integer input here
        // Modify the below call to assign the result of the method call to a variable.
    Scanner input = new Scanner (System.in);
     int a = input.nextInt();

        System.out.println(square(a));
        // Put the result System.out code here.
    }
}
