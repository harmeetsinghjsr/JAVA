import java.util.*;

public class LargestandSmallest  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int smallest = a[0];

        // TODO: loop from i=1 to n-1 and update largest/smallest

        for (int i=1;i<n;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }
            if(a[i]<smallest)
            {
                smallest=a[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);

        sc.close();
    }
}