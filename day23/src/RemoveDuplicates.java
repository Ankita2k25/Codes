import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,5,9,1,3,2,5);
        List<Integer>Update_list=list.stream().distinct().collect(Collectors.toList());
        System.out.println(Update_list);
    }
}
