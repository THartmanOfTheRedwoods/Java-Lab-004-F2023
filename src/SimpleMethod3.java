import java.util.Scanner;


public class SimpleMethod3 {


/*
    NOTE: You can create multiple methods with the same name and different return
          types or parameters (Overloading methods).
          Overloaded methods can even call each-other, but you'll have to type
          the arguments correctly and cast upon return.*/

    public static int square(int number) {
        return (int)Math.pow(number, 2); //squares the int type input
    }

    public static double square(double number) {
        return Math.pow(number, 2); //squares the double type input
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to square: ");
        // Integers Used
        int input = Integer.parseInt(scanner.nextLine()); //assigns the input to a variable name
        int result = square(input); //calls method
        System.out.printf("The square of %d is %d%n", input, result); //prints result as well as the original input

        System.out.print("What number would you like to square: ");
        // Doubles used
        double input2 = Double.parseDouble(scanner.nextLine()); //assigns the input to a variable name
        double result2 = square(input2); //calls method
        System.out.printf("The square of %f is %f%n", input2, result2); //prints result as well as the original input
    }
}
