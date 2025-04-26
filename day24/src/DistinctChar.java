import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Get distinct characters from a list of strings.
public class DistinctChar {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("ankhi","raj","debli","okay");
        List<Character> ch = list.stream()
                .flatMap(str -> str.chars().mapToObj(c -> (char) c))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(ch);
    }
}
