import java.util.*;
public class RepeatedDigitalSum {
    public int repeatedSum(int n){
        n = Math.abs(n);
        while (n>=10)
        {
            int sum =0;
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RepeatedDigitalSum rds = new RepeatedDigitalSum();
        int x = rds.repeatedSum(n);
        System.out.println("The repeated digital sum of " + n + " is: " + x);
    }
}
