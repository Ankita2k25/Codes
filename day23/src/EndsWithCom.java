import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EndsWithCom {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Google.com","Youtube","Instagram.com");
        List<String>list2=list.stream().filter(n->n.endsWith(".com")).collect(Collectors.toList());
        System.out.println(list2);

    }
}
