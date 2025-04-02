package day18;
//How do you filter a list of integers to only include even numbers and 
//then calculate the sum of those numbers using the Stream API?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum_even_no {
public static void main(String[] args) {
	List<Integer>Numbers=Arrays.asList(1,2,3,4,7);
	int sum_even=Numbers.stream().filter(n->n%2==0).collect(Collectors.summingInt(Integer::intValue));
	System.out.println(sum_even);
}
}
