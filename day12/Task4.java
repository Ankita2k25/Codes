package day12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Sort a List Using Streams
//
//Sort the given list of numbers in descending order.
//java
//Copy code
//List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 10, 2);

public class Task4 {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 10, 2);
	List<Integer>sorted=numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	System.out.println(sorted);
}
}
