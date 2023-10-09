import java.util.Scanner;

public class SimpleMethod {
    // Put your method code here
    public static int square(int x){
        return x * x;
    }
    public static void main(String[] args) {
        // This is the method call, create the square method.
        Scanner s = new Scanner(System.in);

        System.out.print("Please input requested integer to square: ");
        String inputString = s.nextLine(); // Request user input

        int inputInt = Integer.parseInt(inputString); // Parse input string into integer
        int result = SimpleMethod.square(inputInt); // Calculate square using parsed integer

        System.out.printf("%s squared is %d", inputString, result);
    }
}
