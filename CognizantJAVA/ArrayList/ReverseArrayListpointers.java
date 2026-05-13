import java.util.ArrayList;
import java.util.Scanner;
public class ReverseArrayListpointers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<n;i++){
            al.add(in.nextInt());
        }

        int i=0,j=al.size()-1;

        while(i<j){
            int temp=al.get(i);
            al.set(i, al.get(j));
            al.set(j, temp);
            i++;
            j--;

        }
        for(int x: al)
        System.out.print(x+" ");

    }
}