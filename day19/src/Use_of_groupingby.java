import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Group strings by their length
public class Use_of_groupingby {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange");
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
    }
}
