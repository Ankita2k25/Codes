package day16;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

        // Insert elements (Thread-safe)
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        // Iterate using forEach (Thread-safe)
        scores.forEach((name, score) -> 
            System.out.println(name + ": " + score)
        );
    }
}
