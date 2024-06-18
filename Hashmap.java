import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Alice", 35);

        // Access values using keys
        int johnAge = hashMap.get("John");
        System.out.println("John's age: " + johnAge);

        // Check if a key exists in the HashMap
        boolean isAlicePresent = hashMap.containsKey("Alice");
        System.out.println("Is Alice present? " + isAlicePresent);

        // Remove a key-value pair from the HashMap
        hashMap.remove("Jane");

        // Iterate over the HashMap
        for (String name : hashMap.keySet()) {
            int age = hashMap.get(name);
            System.out.println(name + "'s age: " + age);
        }
    }
}
