/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng 1/20/2023
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class SimpleMethod2 {
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String input = s.nextLine();
        int num = Integer.valueOf(input);
        int squaredResult = square(num);
        System.out.println("Square of " + num + " is: " + squaredResult);
    }
}