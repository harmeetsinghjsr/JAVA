import java.util.*;
public class FibonacciRecursion {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find fibonacci: ");
        int n = in.nextInt();
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
        in.close();
    }
}
