public class SimpleMethod {


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
     * Assigns an int value to a variable, squares the value, then prints product to terminal
     * @author Atticus Blanco
     * @throws NumberFormatException If the user enters an invalid integer
     * @see SimpleMethod#square(int)
     */
    public static void main(String[] args) {
        int squareRootNum = 25;
        int squaredNum = square(squareRootNum);
        System.out.println(squaredNum);
    }
}
