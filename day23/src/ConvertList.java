import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert a list of strings to a list of their lengths.
public class ConvertList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Ankita","Rakesh","Deblina");
        List<Integer> list1=list.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println(list1);
    }
}
