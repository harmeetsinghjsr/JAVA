public class Geeks {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("GeeksforGeeks");
        System.out.println("Initial: " + sb);

        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        sb.insert(13, " Java");
        System.out.println("After insert: " + sb);

        sb.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + sb);

        sb.delete(8, 14);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        char c = sb.charAt(5);
        System.out.println("Character at index 5: " + c);

        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);

        String sub = sb.substring(5, 10);
        System.out.println("Substring (5–10): " + sub);

        sb.reverse(); // Revert for search
        System.out.println("Index of 'Geeks': " + sb.indexOf("Geeks"));

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // String result = sb.toString();
        System.out.println("Final String: " + sb);
    }
}