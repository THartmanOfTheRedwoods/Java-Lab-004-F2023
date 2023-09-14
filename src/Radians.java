
import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        return degrees*Math.PI/180;
    }

    public static double toDegrees( double radians) {
        return radians*Math.PI/180;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here
        System.out.println(Math.toRadians(degrees));

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        System.out.println(Math.toDegrees(radians));


        // Add System.out, your method call, and Math.toDegrees call here
    }
}
