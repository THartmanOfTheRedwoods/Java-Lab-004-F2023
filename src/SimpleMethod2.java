import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square (int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Put scanner code to get integer input here
        System.out.println("What number would you like to square? ");
        Scanner s = new Scanner(System.in);
        int num = Integer.valueOf(s.nextLine());
        // Modify the below call to assign the result of the method call to a variable.
        square(num);
        int result = square(num);

        // Put the result System.out code here.
        System.out.println(result);
    }
}
