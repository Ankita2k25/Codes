import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Filter squared numbers that are greater than 100.
public class SquareNums2 {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(4,9,12,5);
        List<Integer>list2=list.stream().map(n->n*n).collect(Collectors.toList());
        List<Integer>list3=list2.stream().filter(n->n>50).collect(Collectors.toList());
        System.out.println(list3);
    }
}
