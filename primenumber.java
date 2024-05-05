import java.util.Scanner;
public class primenumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        
    }
}