import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //get elements
        int ele = list.get(0);
        System.out.println(ele);
        //add element at index
        list.add(1, 1);
        System.out.println(list);
        //set element at index
        list.set(0,-1);
        System.out.println(list);
        //delete element at index
        list.remove(3);
        System.out.println(list);
        //size of list
        int size = list.size();
        System.out.println(size);
        //check if list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("is the list empty?\t"+isEmpty);
        //loop through list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //loop through list using iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        //sorting
        Collections.sort(list);
    }
}