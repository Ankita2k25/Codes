import java.util.Arrays;
import java.util.List;
import java.util.Optional;


//Find the longest string in a list using reduce().
public class ReduceQn1 {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("Ankhi","Sudan","Karan","Anushka");
        Optional<String>str= Optional.of(list.stream().reduce("", (n, n1) -> n.length() > n1.length() ? n : n1));
        System.out.println("String"+str);
    }
}
