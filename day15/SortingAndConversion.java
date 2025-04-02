package day15;
import java.util.*;

	public class SortingAndConversion {
	    public static void main(String[] args) {
	        // 6. Sort ArrayList in ascending and descending order
	        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));
	        Collections.sort(numbers);
	        System.out.println("Ascending order: " + numbers);
	        Collections.sort(numbers, Collections.reverseOrder());
	        System.out.println("Descending order: " + numbers);

	        // 7. Convert ArrayList to HashSet to remove duplicates
	        ArrayList<Integer> duplicateNumbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
	        HashSet<Integer> uniqueNumbers = new HashSet<>(duplicateNumbers);
	        System.out.println("After removing duplicates: " + uniqueNumbers);

	        // 8. Demonstrate HashSet, LinkedHashSet, TreeSet differences
	        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 8, 1, 2));
	        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(5, 3, 8, 1, 2));
	        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(5, 3, 8, 1, 2));
	        System.out.println("HashSet (no order): " + hashSet);
	        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
	        System.out.println("TreeSet (sorted order): " + treeSet);

	        // 9. Sort strings using TreeSet
	        TreeSet<String> sortedStrings = new TreeSet<>(Arrays.asList("Banana", "Apple", "Cherry"));
	        System.out.println("Sorted strings: " + sortedStrings);

	        // 10. Merge two HashMaps
	        HashMap<String, Integer> map1 = new HashMap<>();
	        map1.put("A", 1);
	        map1.put("B", 2);
	        HashMap<String, Integer> map2 = new HashMap<>();
	        map2.put("C", 3);
	        map2.put("B", 4); // This will overwrite the value for key "B"
	        HashMap<String, Integer> mergedMap = new HashMap<>(map1);
	        mergedMap.putAll(map2);
	        System.out.println("Merged HashMap: " + mergedMap);
	    }
	}

