/**
 * @author Trevor Hartman
 * @author Trevor Hartman
 *
 * @since Version 1.0
 */

import java.sql.SQLOutput;
import java.util.Scanner;
public class Radians {


   public static double toRadians(double degrees) {
        // Pur your code here
       return degrees * (Math.PI/180);
    }

    public static double toDegrees(double radians) {
        // Put your code here
        return radians * (180/Math.PI);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        // Add System.out, your method call, and Math.toRadians call here
        System.out.printf("%f%n", toRadians(degrees));
        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        System.out.printf("%f%n", toDegrees(radians));

        // Add System.out, your method call, and Math.toDegrees call here
    }


}
