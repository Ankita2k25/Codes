package day12;
//Find duplicate elements in a given list.
//java
//Copy code
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7);

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

	public class Task9 {
//		Find duplicate elements in a given list.
		
		public static void main(String[] args) {
			
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7);
	Set<Integer> tempSet= new HashSet<>();
	List<Integer> Resultset=new ArrayList<>();
	numbers.forEach(e->{
		if(!tempSet.add(e))
		{
			Resultset.add(e);
		}
	});
	System.out.println(Resultset);
	}
}

