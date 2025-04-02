package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BasicListOperations {
	 public static void main(String[] args) {
	        // 1. Create ArrayList, add elements and print
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);
	        System.out.println("ArrayList elements: " + numbers);

	        // 2. Remove duplicates from List
	        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
	        Set<Integer> setWithoutDuplicates = new LinkedHashSet<>(listWithDuplicates);
	        List<Integer> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);
	        System.out.println("List after removing duplicates: " + listWithoutDuplicates);
	        
//	        ArrayList<Integer> list = new ArrayList<>();
//	        list.add(1);
//	        list.add(2);
//	        list.add(3);
//	        list.add(2);
//	        List<Integer> dublicateList=new ArrayList<>();
//	    	list.forEach(e->{
//	    		if(!dublicateList.contains(e)) {
//	    			dublicateList.add(e);
//	    		}
//	    		else if(dublicateList.contains(e)) {
//	    			dublicateList.remove(e);
//	    		}
//	    	});
//	    	System.out.println(dublicateList);

	        // 3. Check if HashSet contains element
	        HashSet<String> names = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie"));
	        System.out.println("Contains 'Bob': " + names.contains("Bob"));
	        System.out.println("Contains 'David': " + names.contains("David"));

	        // 4. HashMap for student marks
	        HashMap<String, Integer> studentMarks = new HashMap<>();
	        studentMarks.put("Ankhi", 85);
	        studentMarks.put("Bob", 90);
	        studentMarks.put("Charlie", 78);
	        String studentName = "Bob";
	        System.out.println(studentName + "'s marks: " + studentMarks.get(studentName));

	        // 5. Iterate TreeSet in descending order
	        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(5, 3, 8, 1, 2));
	        System.out.println("TreeSet in descending order:");
	        Iterator<Integer> descIterator = treeSet.descendingIterator();
	        while (descIterator.hasNext()) {
	            System.out.println(descIterator.next());
	        }
	    }
}
