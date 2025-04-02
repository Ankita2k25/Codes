package day18;

import java.util.Arrays;
import java.util.List;

public class Count_string_start_with_a {
public static void main(String[] args) {
	List<String>words=Arrays.asList("abb","aab","bbc","bcc","aba");
	int count=(int) words.stream().filter(s->s.startsWith("a")).count();
	System.out.println(count);
	
}
}
