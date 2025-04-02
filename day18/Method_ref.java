package day18;

import java.util.Arrays;
import java.util.List;

//How do you use method references to print the elements of a list of strings?
public class Method_ref {
public static void main(String[] args) {
	List<String>Strings=Arrays.asList("aa","bb","cc");
	Strings.forEach(System.out::print);
}
}
