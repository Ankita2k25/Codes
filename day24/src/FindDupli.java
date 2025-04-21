import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Find duplicate elements in a list using Stream API.
public class FindDupli {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,1,4,5,6,4);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(n->!set.add(n)).forEach(System.out::println);
    }
}
