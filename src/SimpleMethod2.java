    import java.util.Scanner;

public class SimpleMethod2 {
    public static int square(int input) {
        return input * input;
    }
        public static void main(String[] args) {
            // put scanner code to integer input
            Scanner scanner= new Scanner(System.in);
            System.out.println("write an integer");
            int input= scanner.nextInt();
            System.out.println(square(input));
        }
    }



