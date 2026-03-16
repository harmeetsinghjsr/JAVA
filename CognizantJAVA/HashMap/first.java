import java.util.*;
public class first {
    public static void main(String[] args) {
        HashMap<Integer, String> map= new HashMap<>();

        map.put(1, "harmeet");
        map.put(2,"singh");

        boolean haskey=map.containsKey(1);
        boolean hasval=map.containsValue("harmeet");
        System.out.println(haskey+" "+hasval);
        System.out.println(map.get(2));

        for(Map.Entry<Integer, String> e: map.entrySet())
        System.out.println(e.getKey()+"="+e.getValue());

    }
}