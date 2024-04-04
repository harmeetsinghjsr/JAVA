import java.util.*;

public class Exception2 {
    int div(int a,int b){
        int r=a/b;
        return r;
    }

    public static void main(String[] args) {
        Exception2 ob = new Exception2();
        try {
            Scanner in = new Scanner(System.in);
            int[] n = new int[5];
            for (int i = 0; i < 5; i++) {
                try {
                    n[i] = in.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Exception: Input Mismatch. Please enter an integer.");
                    in.next(); // to consume the invalid token
                }
            }
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(ob.div(45, 0) + ", " + n[i]);
                } catch (ArithmeticException ex) {
                    System.out.println("Exception: Cannot divide by Zero");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception: Array Index Out Of Bound");
        }
    }
}
