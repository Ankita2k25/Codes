import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//Join all non-empty strings with a comma.
public class JoinString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("aa","","bb","cc","");
        String list1= list.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
        System.out.println(list1);
    }
}
