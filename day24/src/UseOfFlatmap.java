import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseOfFlatmap {
    public static void main(String[] args) {
        List<List<Integer>>lists= Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5),Arrays.asList(6,7,8,9,10));
        List<Integer>list2=lists.stream().flatMap(n->n.stream()).collect(Collectors.toList());
        System.out.println(list2);
    }
}
