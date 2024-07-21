import java.util.*;
class PerfectSquareArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        int x,c=0;
        System.out.println("Enter the elements of the array");
        for(int i=0;i<10;i++)
        {
            a[i] = in.nextInt();
        }
        System.out.println("The perfect squares in the array are");
        for(int i=0;i<10;i++)
        {
            x = (int)Math.sqrt(a[i]);
            if(x*x == a[i])
            {
                System.out.println(a[i]);
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("No perfect squares in the array");
        }
    }
}