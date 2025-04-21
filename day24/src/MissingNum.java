import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Find missing numbers in a range using Stream API.
public class MissingNum {
    public static void main(String[] args) {
    List<Integer> list= Arrays.asList(2,4,6,1,9);
        List<Integer>list1=IntStream.range(2,9).filter(s->!list.contains(s)).boxed().collect(Collectors.toList());
        System.out.println(list1);
    }
}
