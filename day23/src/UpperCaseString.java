import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert a list of strings to uppercase.
//Convert a list of strings to lowercase.
public class UpperCaseString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Ankita");
        List<String>str=list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        List<String>str2=list.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
        System.out.println(str);
        System.out.println(str2);
    }
}
