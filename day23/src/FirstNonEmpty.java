import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get the first non-empty string from a list.
public class FirstNonEmpty {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("","","bb","cc","");
        List<String>list1=list.stream().filter(s->!s.isEmpty()).limit(1).collect(Collectors.toList());
        System.out.println(list1);
    }
}
