import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the square of each number in a list.
public class Square_of_Nums {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3);
        List<Integer>list2=list.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(list2);
    }
}
