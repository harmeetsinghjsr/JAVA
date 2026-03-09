import java.util.*;
public class MinMax {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
    
            int n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
    
            for(int i=0;i<n;i++){
                list.add(in.nextInt());
            }
            
            int min=list.get(0);
            int max=list.get(0);

            for(int i=1;i<=n-1;i++)
            {
                if(list.get(i)<min)
                min=list.get(i);
                if(list.get(i)>max)
                max=list.get(i);
            }
            System.out.println("Minimum: "+min);
            System.out.println("Maximum: "+max);

            in.close();
    }
}
