public class queue {
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

public static void main(String[] args) {
    queue q = new queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    System.out.println("Dequeued element: " + q.dequeue());
    System.out.println("Is queue empty? " + q.isEmpty());
    System.out.println("Size of queue: " + q.getSize());
}
}
