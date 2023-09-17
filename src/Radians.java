
import java.util.Scanner;

public class Radians {

    public static double toRadians (double degrees, double radians) {
        // Pur your code here
        return degrees = radians * 180 / Math.PI;
    }

    public static double toDegrees(double radians, double degrees) {
        // Put your code here
        return radians = degrees * Math.PI / 180;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.parseDouble(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here
        System.out.printf("%.5f\n",Math.toRadians(degrees));

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.parseDouble(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here
        System.out.println();
        System.out.printf("%.5f\n",Math.toDegrees(radians));
    }
}