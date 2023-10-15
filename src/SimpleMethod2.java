import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int number) {
        int answer = number * number;
        return answer;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        System.out.println("enter number to square");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        int realanswer= square(number);
        // Put the result System.out code here.
        System.out.println(number+"^2="+realanswer);
    }
}
