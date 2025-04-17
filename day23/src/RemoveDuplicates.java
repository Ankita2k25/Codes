import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Remove duplicates from a list of integers.
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,5,9,1,3,2,5);
        List<Integer>Update_list=list.stream().distinct().collect(Collectors.toList());
        System.out.println(Update_list);
    }
}
