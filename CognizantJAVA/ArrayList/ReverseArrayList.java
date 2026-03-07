import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<n;i++){
            list.add(in.nextInt());
        }
        for(int i = list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        in.close();
    }
}