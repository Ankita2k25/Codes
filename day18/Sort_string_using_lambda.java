package day18;


import java.util.Arrays;

public class Sort_string_using_lambda {
public static void main(String[] args) {
	java.util.List<String>words=Arrays.asList("Lemon","Ice","Tea","Pineappple","Guava");
	words.sort((e1,e2)-> e1.length()-e2.length());
	System.out.println(words);
}
}
