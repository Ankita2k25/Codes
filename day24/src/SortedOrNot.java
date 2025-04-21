import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Check if a list is sorted using Stream API.
public class SortedOrNot {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,3,2,4,5);

        Boolean check= IntStream.range(0,list.size()-1).allMatch(i -> list.get(i) <= list.get(i + 1));
        System.out.println(check);
    }
}
