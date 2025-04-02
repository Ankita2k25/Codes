package day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//8.How would you flatten a list of lists of integers into a single list of integers using flatMap?
public class UsecaseofFLATMAP {
public static void main(String[] args) {
	List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        // Flatten using flatMap
        List<Integer> flattenedList = listOfLists.stream()
            .flatMap(List::stream) 
            .collect(Collectors.toList());

        System.out.println(flattenedList);
}
}
