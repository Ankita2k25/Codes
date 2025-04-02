package day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_name_start_with_a {
public static void main(String[] args) {
	List<String>words=Arrays.asList("Ankhi","Biswa","Deblina","Akash");
	List<String>a_words=words.stream().map(word->word.toLowerCase()).filter(w->w.startsWith("a")).collect(Collectors.toList());
	System.out.println(a_words);
}
}
