package day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Checkif_n_greater_5_lesser_10 {
public static void main(String[] args) {
	List<Integer>nums=Arrays.asList(12,3,6,8,1,9);
	List<Integer>list=nums.stream().filter(a->a>=5&&a<=10).collect(Collectors.toList());
	System.out.println(list);
}
}
