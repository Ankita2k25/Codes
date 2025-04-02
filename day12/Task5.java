package day12;
import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
import java.util.Optional;
//import java.util.stream.Collectors;
//Find the Maximum and Minimum Value
//
//Find the maximum and minimum values in a list of integers
public class Task5 {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 10, 2);
	Optional<Integer> maxNum = numbers.stream()
            .max(Integer::compare);
	Optional<Integer> minNum = numbers.stream()
            .min(Integer::compare);
	System.out.println(maxNum);
	System.out.println(minNum);
}
}
