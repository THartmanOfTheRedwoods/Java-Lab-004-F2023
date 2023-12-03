/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng 1/20/2023
 *
 * @since Version 1.0
 *
 */

public class SimpleMethod {
    public static void squareAndPrint(int number){
        int result = square(number);
        System.out.println("The square of " + number + " is: " + result);
    }
    public static int square(int num) {

        return num * num;
    }
    public static void main(String[] args) {
        // This is the method call, create the square method.
        int num = 25;
        System.out.println(square(num));
    }
}
