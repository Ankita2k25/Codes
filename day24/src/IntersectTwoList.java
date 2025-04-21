import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Find the intersection of two lists using streams.
public class IntersectTwoList {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,5,1);
        List<Integer>list1=Arrays.asList(4,7,2,5);
        List<Integer>list2=list.stream()
                .filter(list1::contains)
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
