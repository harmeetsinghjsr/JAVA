import java.util.*;

public class UniqueWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(in.nextLine());
        }

        LinkedHashSet<String> set= new LinkedHashSet<> (list);
        for(String word : set)
        System.out.print(word+" ");

        in.close();
    }
}