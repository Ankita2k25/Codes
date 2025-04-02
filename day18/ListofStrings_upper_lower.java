package day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ListofStrings_upper_lower {
public static void main(String[] args) {
	List<String>Names=Arrays.asList("AnkitaMitra","PayelDas", "AkashBarman");
	List<String> allParts = Names.stream()
		    .flatMap(name -> Arrays.stream(name.split("(?=[A-Z])")))
		    .collect(Collectors.toList());
		System.out.println(allParts); 
}
}
