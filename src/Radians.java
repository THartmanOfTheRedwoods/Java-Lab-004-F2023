/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng 1/20/2023
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class Radians {
    public static double toRadians(double degrees) {
        return Math.toRadians(degrees);
    }

    public static double toDegrees(double radians) {
        return Math.toDegrees(radians);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degreesInput = Double.valueOf(scanner.nextLine());
        double radiansResult = toRadians(degreesInput);
        System.out.println("Result in radians: " + radiansResult);

        System.out.print("Type radians you'd like converted to degrees: ");
        double radiansInput = Double.valueOf(scanner.nextLine());
        double degreesResult = toDegrees(radiansInput);
        System.out.println("Result in degrees: " + degreesResult);
    }
}