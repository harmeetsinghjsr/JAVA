import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapBasics {
    public static void main(String[] args) {

        // 1) Insertion‑order map for scores
        Map<String, Integer> scores = new LinkedHashMap<>();

        // Add entries
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);
        scores.put(null, 100);   // LinkedHashMap allows one null key
        scores.put("Bob", 88);   // replaces old value (85)
        scores.put("Bob", 8);    // replaces old value (88)
        scores.put("Bob", 100);  // replaces old value (8)

        // Read
        System.out.println("Score of Alice: " + scores.get("Alice"));          // 90
        System.out.println("Contains Bob? " + scores.containsKey("Bob"));      // true
        System.out.println("Contains 92? " + scores.containsValue(92));        // true

        // Iterate entries (in insertion order of keys)
        System.out.println("Scores (insertion order):");
        for (Map.Entry<String, Integer> e : scores.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // 2) Count word frequencies using merge, preserving first‑seen order
        String[] words = {"apple", "banana", "apple", "kiwi", "banana", "apple"};
        LinkedHashMap<String, Integer> freq = new LinkedHashMap<>();

        for (String w : words) {
            // if w is new → put(w,1), else → put(w, old+1)
            freq.merge(w, 1, Integer::sum);
        }

        System.out.println("Frequencies (insertion order): " + freq);
        // Output: Frequencies (insertion order): {apple=3, banana=2, kiwi=1}
    }
}