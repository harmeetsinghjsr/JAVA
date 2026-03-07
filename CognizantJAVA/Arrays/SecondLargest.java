import java.util.*;
class SecondLargest
{
    public void secondLargest(int a[]){
//         Arrays.sort(a);
//         System.out.println(a[a.length-2]);

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                secondMax=max;
                max=a[i];
            }
            else if(a[i]>secondMax && a[i]!=max)
            {
                secondMax=a[i];
            }
        }   
        System.out.println(secondMax);
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        SecondLargest ob = new SecondLargest();
        ob.secondLargest(a);
        // for(int i=0;i<n;i++)
        // {
        //     a[i]=sc.nextInt();
        // }
        // Arrays.sort(a);
        // System.out.println(a[n-2]);
    }
}