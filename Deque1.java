import java.*;
import java.util.Deque;
public class Deque1 {
    public static void main(String args[])
    {
        Deque<String> deque=new LinkedList<Integer>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.add(3);
        deque.removeFirst();
    }
}
