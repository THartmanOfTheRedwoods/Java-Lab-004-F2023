import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int x){
        return x * x;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        // Modify the below call to assign the result of the method call to a variable.
        // Put the result System.out code here.
        // This is the method call, create the square method.
        //square(input);

        Scanner s = new Scanner(System.in);

        System.out.print("Please input requested integer to square: ");
        String inputString = s.nextLine(); // Request user input

        int inputInt = Integer.parseInt(inputString); // Parse input string into integer
        int result = SimpleMethod2.square(inputInt); // Calculate square using parsed integer

        System.out.printf("%s squared is %d", inputString, result);
        // I already had done this in SimpleMethod1, sorry
    }

}
