import java.util.*;
public class Recursion {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int n = in.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        in.close();
    }

}