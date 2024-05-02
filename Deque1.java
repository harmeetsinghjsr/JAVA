// import java.util.LinkedList;
// import java.util.Deque;
import java.util.*;
public class Deque1 {
    public static void main(String args[])
    {
        Deque<String> deque=new LinkedList<String>();
        deque.addFirst("1");
        deque.addLast("2");
        deque.add("3");
        deque.removeFirst();
        deque.removeLast();
        deque.push("4");
        deque.pop();
        System.out.println(deque);
        deque.offer("5");
        deque.offerFirst("6");
        deque.offerLast("7");
        System.out.println(deque);
        // deque.poll();//Retrieves and removes the head of the queue represented by this deque
        // deque.pollFirst();
        // deque.pollLast();
        // System.out.println(deque);
        deque.add("8");
        deque.add("9");
        deque.add("10");
        System.out.println(deque);      
        Iterator iterator=deque.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        } 
    }
}
