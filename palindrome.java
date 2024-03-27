import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int x=n;
        int rev=0;
        while(x!=0)
        {
            rev=rev*10+(x%10);
            x=x/10;
        }
        
        
        if(rev==n)
        {
            System.out.println("The number is a palindrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
        }
    }
}