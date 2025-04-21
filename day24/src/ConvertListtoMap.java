import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Convert a list of strings into a map with string length as key and values as list of strings.
public class ConvertListtoMap {
    public static void main(String[] args) {
        List<String>str= Arrays.asList("Ankita","Rakesh","Aditi");
        Map<Integer, List<String>> list=str.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(list);
    }
}
