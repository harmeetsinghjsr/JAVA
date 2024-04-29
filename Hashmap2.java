import java.util.*;
public class Hashmap2 {
    public static void main(String args[])
    {
        HashMap<Integer,String> days=new HashMap<>();
        days.put(1,"Sunday");
        days.put(3,"Monday");
        days.put(6,"Wednesday");
        System.out.println(days);
        System.out.println(days.get(6));
        days.replace(3,"Tuesday");
        System.out.println(days);
        days.remove(1);
        System.out.println(days);
    }
}
