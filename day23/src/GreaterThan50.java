import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Filter numbers greater than 50 from a list.
public class GreaterThan50 {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(21,57,43,64);
        List<Integer>list2=list.stream().filter(n->n>50).collect(Collectors.toList());
        System.out.println(list2);
    }
}
