
import java.util.Scanner;

public class Radians {

    public static double toRadians (double degrees) {
        // Pur your code here
        return degrees * Math.PI / 180;
    }

    public static double toDegrees(double radians) {
        // Put your code here
        return radians * 180 / Math.PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type degrees you'd like converted to radians: ");
        double degreesI = Double.parseDouble(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here
        System.out.printf("%.5f\n",Math.toRadians(degreesI));
        double radians =toRadians(degreesI);
        System.out.printf("%.5f\n",radians);

        System.out.print("Type radians you'd like converted to degrees: ");
        double radiansI = Double.parseDouble(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here
        System.out.printf("%.5f\n",Math.toDegrees(radiansI));
        double degrees =toDegrees(radiansI);
        System.out.printf("%.5f\n",degrees);
    }
}