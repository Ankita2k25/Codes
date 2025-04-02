package day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Convert a List of Strings to Uppercase

Given a list of names, convert all names to uppercase using Streams.
java
Copy code
List<String> names = Arrays.asList("alice", "bob", "charlie")*/
public class Task2 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("alice", "bob", "charlie");
	

	 List<String> upper = names.stream()
             .map(String::toUpperCase)
             .collect(Collectors.toList());
	 System.out.println(upper);
}
}
