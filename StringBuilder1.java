import java.util.*;
public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //append elements
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb);
        //insert element at index
        sb.insert(5, "Java");
        System.out.println(sb);
        //delete element at index
        sb.delete(5, 9);
        System.out.println(sb);
        //replace element at index
        sb.replace(5, 10, "Java");
        System.out.println(sb);
        //reverse
        sb.reverse();
        System.out.println(sb);
        //length of string
        int length = sb.length();
        System.out.println(length);
        //capacity of string
        int capacity = sb.capacity();
        System.out.println(capacity);
        //check if string is empty
        boolean isEmpty = sb.length() == 0;
        System.out.println("is the string empty?\t"+isEmpty);
        //loop through string
        for(int i=0;i<sb.length();i++){
            System.out.print(sb.charAt(i));
        }
        System.out.println();
    }
}
