import java.util.Arrays;
import java.util.List;

//Check if any string is empty in a list.
public class EmptyStringInList {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("",null,"a","Bc");
        boolean c= list.stream().filter(s->s!=null).anyMatch(s->s.isEmpty());
        System.out.println(c);
    }
}
