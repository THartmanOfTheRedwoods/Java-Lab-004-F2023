import java.util.Scanner;


public class Radians {

    public static double toRadians(double degrees) {
        return degrees * Math.PI / 180;  //formula for converting to radians
    }

    public static double toDegrees(double radians) {
        return radians * 180 / Math.PI; //formula for converting to degrees
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.parseDouble(scanner.nextLine()); // assigns the user's input to a variable
        System.out.println(toRadians(degrees)); //calls toRadians method and prints result
        System.out.println(Math.toRadians(degrees)); //prints the Math.toRadians for comparison


        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.parseDouble(scanner.nextLine()); // assigns user input to a variable
        System.out.println(toDegrees(radians)); //calls toDegrees method and prints result
        System.out.println(Math.toDegrees(radians)); // prints the Math.toDegrees for comparison
    }
}