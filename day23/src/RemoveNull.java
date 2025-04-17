import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//Remove all null values from a list.
public class RemoveNull {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("B",null,"k","Y",null);
        List<String>list1=list.stream().filter(s->s!=null).collect(Collectors.toList());
        System.out.println(list1);
    }
}
