import java.util.Scanner;
import static java.lang.Math.PI;

public class Radians {

    double radians;
    double degrees;

    public static void toRadians(double degrees) {
        Radians rads = new Radians();
        rads.radians = degrees * PI / 180;
    }

    public void toDegrees(double radians) {
        Radians rads = new Radians();
        rads.degrees = radians * 180 / PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Radians rads = new Radians();

        System.out.print("Type degrees you'd like converted to radians: ");
        rads.degrees = Double.valueOf(scanner.nextLine());
        rads.toRadians(rads.degrees);

        System.out.println(rads.degrees + " degrees is equal to " + rads.radians + " radians");

        System.out.print("Type radians you'd like converted to degrees: ");
        rads.radians = Double.valueOf(scanner.nextLine());
        rads.toDegrees(rads.radians);

        System.out.println(rads.radians + " radians is equal to " + rads.degrees + " degrees");
    }
}