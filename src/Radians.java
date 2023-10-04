import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
       return degrees * (Math.PI / 180.0);
    }

    public static double toDegrees(double radians) {
        return radians * (180.0 / Math.PI);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.parseDouble(scanner.nextLine());

        double radians = toRadians(degrees);
        System.out.println("Degrees to Radians: " + radians);
        // Add System.out, your method call, and Math.toRadians call here

        System.out.print("Type radians you'd like converted to degrees: ");
        radians = Double.parseDouble(scanner.nextLine());

        degrees = toDegrees(radians);
        System.out.println("Radians to Degrees: " + degrees);

        // Add System.out, your method call, and Math.toDegrees call here
    }
}
