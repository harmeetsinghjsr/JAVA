
import java.util.*;

public class ReverseArray {
    public static void main(String a[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ; i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Reversed Array:");
        for(int i=n-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}