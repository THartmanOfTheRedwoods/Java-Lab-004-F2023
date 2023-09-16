import java.util.Scanner;

public class Radians {

   public static double toRadians(double degrees) {
    return degrees * (Math.PI / 180);
  }

   public static double toDegrees(double radians) {
       return radians * (180 / Math.PI);
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Type degrees you'd like converted to radians: ");
       double degrees = Double.valueOf(scanner.nextLine());
       double converted_degrees1 = toRadians(degrees);
       double converted_degrees2 = Math.toRadians(degrees);
       System.out.println("My Method :" + converted_degrees1);
       System.out.println("Math.toRadians :" + converted_degrees2);
        // Add System.out, your method call, and Math.toRadians call here


     System.out.print("Type radians you'd like converted to degrees: ");
       double radians = Double.valueOf(scanner.nextLine());
       double converted_radians1 = toDegrees(radians);
       double converted_radians2 = Math.toDegrees(radians);
       System.out.println("My Method : " + converted_radians1);
       System.out.println("Math.toDegrees : " + converted_radians2);
       // Add System.out, your method call, and Math.toDegrees call here
    }
}
