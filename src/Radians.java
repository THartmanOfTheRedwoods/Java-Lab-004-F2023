import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        // Put your code here
        return degrees * (Math.PI / 180.0);
    }

    public static double toDegrees(double radians) {
        // Put your code here
        return radians * (180.0 / Math.PI);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Degrees to Radians block
        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.parseDouble(scanner.nextLine());
        // Add System.out, your method call, and Math.toRadians call here

        System.out.printf("%.2f degrees is equal to %.2f radians.%n", degrees, Radians.toRadians(degrees));

        // Radians to Degree block
        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.parseDouble(scanner.nextLine());
        // Add System.out, your method call, and Math.toDegrees call here

        System.out.printf("%.2f radians is equal to %.2f degrees.%n", radians, Radians.toDegrees(radians));
    }
}
