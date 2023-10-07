public class SimpleMethod {
    public static int square(int number) {
        int squared = number * number;
        System.out.println("Square of " + number +  " is: " + squared);
        return squared;
    }
    public static void main(String[] args) {
        // This is the method call, create the square method.
        square(25);
    }
}
