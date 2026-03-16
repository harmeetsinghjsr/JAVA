import java.util.*;
public class Hash {
    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 3, 2};

        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        for (int x : arr) {
            hs.add(x);
            lhs.add(x);
        }

        System.out.println("HashSet: " + hs);       // order not guaranteed
        System.out.println("LinkedHashSet: " + lhs); // keeps 5,2,3
    }
}