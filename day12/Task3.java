package day12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


//Find the First Element That Matches a Condition
//
//Find the first name that starts with "J" from a list of names.
//java
//Copy code
//List<String> names = Arrays.asList("John", "Alice", "Jake", "Bob");

public class Task3 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("John", "Alice", "Jake", "Bob");
//	List<String>ch=names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
//	System.out.println(ch);
	
	Optional<String>firstName=names.stream().filter(name->name.startsWith("J")).findFirst();
	System.out.println(firstName);
}
}
