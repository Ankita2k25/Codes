package day17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Divide_a_String_using_Stream {
	public static void main(String[] args) {
        String fullName = "AnkitaMitra";

        List<String> parts = Stream.of(fullName.split("(?=[A-Z])"))
                                 .collect(Collectors.toList());
        
        System.out.println(parts); // [Ankita, Mitra]
    }
}
