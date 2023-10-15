public class SimpleMethod {
    // Put your method code here
    public static void square(int number){
        int answer = number * number;
        System.out.println(number+"^2="+answer);
    }
    public static void main(String[] args) {
        // This is the method call, create the square method.
        square(25);
    }
}
