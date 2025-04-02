package day12;

import java.util.Arrays;
import java.util.List;

//Count Elements Matching a Condition
//
//Count how many numbers in a list are greater than 5
public class Task7 {
	public static void main(String[] args) {
		List<Integer>nums=Arrays.asList(10,3,7,9,2);
		//List<Integer> countN=nums.stream().filter(n -> n > 5).collect(Collectors.toList());
		long countN=nums.stream().filter(n->n>5).count();
		System.out.println(countN);
	}

}
