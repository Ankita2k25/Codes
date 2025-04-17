import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find all even numbers from a list of integers.
//Find all odd numbers from a list of integers.
public class Even_no {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,6,5,2,9);
        List<Integer>Even_list=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer>Odd_list=list.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(Even_list);
        System.out.println(Odd_list);
    }
}
