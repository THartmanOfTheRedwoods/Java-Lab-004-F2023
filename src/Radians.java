import java.util.Scanner;

public class Radians {
    final static double PI = 3.14159;
    public static double toRadians(double degrees) {
        return degrees * (PI/180);

        // Pur your code here
    }
    public static double toDegrees(double radians) {
        // Put your code here
        return radians * (180/PI);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        System.out.println(toRadians(degrees));
        // Add System.out, your method call, and Math.toRadians call here

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        System.out.println(toDegrees(radians));
        // Add System.out, your method call, and Math.toDegrees call here
    }
}