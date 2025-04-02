package day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Sum of All Even Numbers
//
//Compute the sum of all even numbers from the given list
public class Task6 {
public static void main(String[] args) {
	List<Integer>nums=Arrays.asList(1,3,4,2);
	int sumOfEvens = nums.stream()
            .filter(n -> n % 2 == 0)  // Filter even numbers
            .collect(Collectors.summingInt(Integer::intValue));  // Sum using Collectors

// Print the result
System.out.println("Sum of even numbers: " + sumOfEvens);
}
}
