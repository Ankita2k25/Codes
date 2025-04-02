package day18;

import java.util.Arrays;
import java.util.List;

//13.How do you use the forEach method in a stream to perform an action on each element, 
//such as printing the elements in uppercase?
public class Foreach_example {
public static void main(String[] args) {
	List<String>lists=Arrays.asList("sad","Happy","Amazing","enjoy");
	lists.stream().forEach(n->System.out.print(" "+n.toUpperCase()));
}
}
