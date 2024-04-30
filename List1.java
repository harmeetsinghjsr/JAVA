import java.util.*;
public class List1 {
    public static void addElement(List<? super Integer> list,int element)

    {
        list.add(element);
    }
    public static void main(String args[])
    {
        List<Integer> intlist=new java.util.ArrayList<>();
        // List<String> strlist=new java.util.ArrayList<>();
        List<Object> objlist=new java.util.ArrayList<>();
        addElement(intlist,3);
        // addElement(strlist,"Hello");
        addElement(objlist,3);
        System.out.println(intlist);
        // System.out.println(strlist);
        System.out.println(objlist);
    }
}
