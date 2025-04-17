import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Count how many strings have more than 5 characters.
public class CountLengthOfStringFIve {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("ABCDD","EFG","HIIJK","IJKKL","TR");
        List<String>list1=list.stream().filter(l->l.length()==5).collect(Collectors.toList());
        System.out.println(list1);
    }
}
