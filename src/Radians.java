import java.util.Scanner;

public class Radians {

   // public static <ADD TYPE> toRadians(<ADD TYPE> degrees)
        // Put your code here
        public static double toRadians (double degrees, double radians){
    }

   // public static <ADD TYPE> toDegrees(<ADD TYPE> radians) {
        // Put your code here
        public static double toDegrees(double radians, double degrees) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        double degrees = Double.parseDouble(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        double radians = Double.parseDouble(scanner.nextLine());
        // Add System.out, your method call, and Math.toDegrees call here
        System.out.println();
        System.out.printf("%.5f\n",Math.toDegrees(radians));
    }
}
