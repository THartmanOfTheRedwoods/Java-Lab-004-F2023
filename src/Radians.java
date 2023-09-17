import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        // Pur your code here
        return degrees * 180 / Math.PI;
    }

    public static double toDegrees(double radians) {
        // Put your code here
        return radians * 180.0 / Math.PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here
        System.out.println(toRadians(degrees));


        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here
        System.out.println(toDegrees(radians));
    }
}
