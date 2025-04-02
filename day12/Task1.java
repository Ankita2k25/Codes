package day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Create a Stream from a List

Given a list of integers, filter out even numbers and print them.
java
Copy code
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
*/
public class Task1 {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	List<Integer>evenNum=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
	
	System.out.println("Even Numbers : "+evenNum);
}
}
