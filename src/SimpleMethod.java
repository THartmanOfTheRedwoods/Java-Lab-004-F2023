/**
 * @author Trevor Hartman
 * @author MJ Fracess
 *
 * @since Version 1.0
 **/

public class SimpleMethod {
    // Put your method code here
    public static int square(int number) {
        return number * number;
    }
    public static void main(String[] args) {
        // This is the method call, create the square method.
        int sqrResult;
        sqrResult = square(25);

        System.out.println(sqrResult);
    }
}
