package ArrayList;
import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> al = new ArrayList<>();


        for(int i=0;i<n;i++){
            al.add(in.nextInt());
        }

        System.out.println(al);
        in.close();
    }
}