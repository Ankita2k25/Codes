import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Limit the list to the first 5 elements.
public class LimitTheList {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("a","b","c","d","e","f","g","h");
        List<String>list1=list.stream().limit(5).collect(Collectors.toList());
        System.out.println(list1);
    }
}
