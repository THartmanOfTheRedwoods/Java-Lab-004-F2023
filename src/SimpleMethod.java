public class SimpleMethod {



    public static int square(int a) {
        int numSquared = a * a;
        return numSquared;
    }

    public static void main(String[] args) {
        int squareRootNum = 25;
        int squaredNum = square(squareRootNum);
        System.out.println(squaredNum);
    }
}
