import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//Check if all strings in the list are non-empty.
public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("Po9","TGHUJ","A");
        boolean check1= list.stream().allMatch(s->!s.isEmpty() || !s.contains(" "));
        System.out.println(check1);
    }
}
