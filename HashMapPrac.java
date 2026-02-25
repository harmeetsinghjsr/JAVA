import java.util.HashMap;
import java.util.Map;

public class HashMapPrac {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);
        scores.put(null, 100);
        scores.put("Bob", 88);
        scores.put("Bob", 8);
        scores.put("Bob", 100);
        System.out.println("Score of Alice: " + scores.get("Alice"));
        System.out.println("Contains Bob? " + scores.containsKey("Bob"));
        System.out.println("Contains 92? " + scores.containsValue(92));
        for (Map.Entry<String, Integer> e : scores.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        String[] words = {"apple", "banana", "apple", "kiwi", "banana", "apple"};
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.merge(w, 1, Integer::sum);
        }
        System.out.println("Frequencies: " + freq);
    }
}