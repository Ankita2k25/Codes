import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get all valid email-like strings from a list.
public class EmailString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Wecan@gmail.com","amy@gmail.com","I","Us","are");
        //Optional<String>S= list.stream().filter(s-> s.contains(s.toUpperCase())).findFirst();
        List<String>list2=list.stream().
                filter(s->s.endsWith("@gmail.com")).collect(Collectors.toList());
        System.out.println(list2);
    }
}
