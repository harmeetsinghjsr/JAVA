import java.util.*;
public class Hashmap1 {
    public static void main(String args[])
    {
        HashMap<Integer,Integer> days=new HashMap<Integer,Integer>();
        days.put(4,12);
        days.put(5,13);
        days.put(6,14);
        System.out.println(days);
        System.out.println(days.get(6));
    }
}