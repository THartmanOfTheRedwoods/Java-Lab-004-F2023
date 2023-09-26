import java.util.Scanner;

public class SimpleMethod2 {


    public static int square(int a) {
        int numSquared = a * a;
        return numSquared;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to square?");

        int userInt = scanner.nextInt();
        int squaredNum = square(userInt);
        System.out.println(squaredNum);
    }
}



