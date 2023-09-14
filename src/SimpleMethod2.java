import java.util.Scanner;

public class SimpleMethod2 {
    public static int square(int inp) {
        return inp * inp; //squares the input value
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number"); //prompts user for input
            int number = Integer.parseInt(sc.nextLine()); //assigns the input a variable name and stores the value
            System.out.println(square(number)); //calls the method and prints the result
    }
}
