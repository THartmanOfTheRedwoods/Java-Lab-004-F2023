import java.util.Scanner;
import static java.lang.Math.PI;

public class Radians {

    double radians;
    double degrees;

    /**
     * Converts degrees to radians
     * @author Atticus Blanco
     * @param degrees
     */
    public void toRadians(double degrees) {
        this.radians = degrees * PI / 180;
    }

    /**
     * Converts radians to degrees
     * @author Atticus Blanco
     * @param radians
     */
    public void toDegrees(double radians) {
        this.degrees = radians * 180 / PI;
    }

    /**
     * Prompts user for degree value, converts to radians, then prints result to terminal.
     * Then prompts user for radian value, converts to degrees, then prints result to terminal.
     * @author Atticus Blanco
     * @throws NumberFormatException If the user enters an invalid integer
     * @see Radians#toDegrees(double)
     * @see Radians#toRadians(double)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Radians rads = new Radians();

        System.out.print("Type degrees you'd like converted to radians: ");
        rads.degrees = Double.valueOf(s.nextLine());
        rads.toRadians(rads.degrees);

        System.out.println(rads.degrees + " degrees is equal to " + rads.radians + " radians");

        System.out.print("Type radians you'd like converted to degrees: ");
        rads.radians = Double.valueOf(s.nextLine());
        rads.toDegrees(rads.radians);

        System.out.println(rads.radians + " radians is equal to " + rads.degrees + " degrees");
    }
}