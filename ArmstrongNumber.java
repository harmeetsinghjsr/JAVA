import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int x=n;
        int sum=0;
        int length = (int)(Math.log10(n)+1);
        while(x!=0)
        {
            int rem=x%10;
            sum=sum+(int)Math.pow(rem, length);
            x=x/10;
        }
        if(sum==n)
        {
            System.out.println("The number is an Armstrong number");
        }
        else
        {
            System.out.println("The number is not an Armstrong number");
        }
    }
}
