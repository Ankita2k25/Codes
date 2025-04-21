import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Implement custom collector to concatenate uppercase names with ;
public class CustomCollector1 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("ANKITA","ManIS!","AnkHi*","TAMASREE");
        String list2=list.stream().filter(s->s.equals(s.toUpperCase())).collect(Collectors.joining(";"));
        System.out.print(list2);
    }


}
