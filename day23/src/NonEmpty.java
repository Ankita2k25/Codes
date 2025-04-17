import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//Get only non-empty strings from a list.
//Count how many strings are empty in a list.
public class NonEmpty {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("","A"," ","W","",null);
        //List<String>list2=list.stream().filter(s->s!=null && !s.trim().isEmpty()).collect(Collectors.toList());
        List<String>list2=list.stream().filter(Objects::nonNull).filter(s->!s.trim().isEmpty()).collect(Collectors.toList());
        System.out.println(list2);
       long count= list.stream().filter(s->s==null || s.trim().isEmpty()).count();
        System.out.println(count);
    }
}
