import java.util.Scanner;

public class SimpleMethod2 {


    /**
     * Squares an integer value
     * @author Atticus Blanco
     * @param a
     * @return numSquared
     */
    public static int square(int a) {
        int numSquared = a * a;
        return numSquared;
    }


    /**
     * Prompts user input for int value, stores it to local variable, squares the value, and prints product to terminal
     * @author Atticus Blanco
     * @throws NumberFormatException If the user enters an invalid integer
     * @see SimpleMethod2#square(int) 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to square?");

        int userInt = Integer.parseInt(scanner.nextLine());
        int squaredNum = square(userInt);
        System.out.println(squaredNum);
    }
}



