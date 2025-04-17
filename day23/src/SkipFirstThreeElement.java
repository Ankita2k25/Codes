import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Skip the first 3 elements and return the rest.
public class SkipFirstThreeElement {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("10","QW","AS","ZX","ER","DF");
        List<String>list1=list.stream().skip(3).collect(Collectors.toList());
        System.out.println(list1);
    }
}
