public class queue {

}
private int[] elements;
private int count;
public static final int DEFAULT_CAPACITY = 10;

public queue() {
    elements = new int[DEFAULT_CAPACITY];
}

public void enqueue(int v) {
    if (count >= elements.length) {
        int[] temp = new int[elements.length * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
    }

    elements[count++] = v;
}

public int dequeue() {
    if (isEmpty()) {
        throw new RuntimeException("Queue is empty");
    }

    int v = elements[0];
    System.arraycopy(elements, 1, elements, 0, --count);
    return v;
}

public boolean isEmpty() {
    return count == 0;
}

public int getSize() {
    return count;
}