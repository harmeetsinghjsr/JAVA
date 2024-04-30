import java.util.*;

public class List2 {
    public static void addElement(List<? super Object> list, Object element) {
        list.add(element);
    }

    public static void main(String args[]) {
        List<Object> objlist = new ArrayList<>();
        addElement(objlist, 3);
        addElement(objlist, "Hello");
        addElement(objlist, 3.14);
        System.out.println(objlist);
    }
}
