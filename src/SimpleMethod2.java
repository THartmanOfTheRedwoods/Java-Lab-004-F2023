import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int num){
        return num * num;

    }

    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner S = new Scanner(System.in);
        System.out.println("Insert number to square or whatever:" );
        String x = S.nextLine();
        int num = Integer.parseInt(x);
        // Modify the below call to assign the result of the method call to a variable.
        int sNum = square(num);
        // Put the result System.out code here.
        System.out.println(sNum);
    }
}
