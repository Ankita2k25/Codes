import java.util.Map;
import java.util.stream.Collectors;

//Count the number of occurrences of each character in a string.
public class OccurenceOfCh {
    public static void main(String[] args) {
        String str="AnkitA";
        Map<Character,Long>map=str.chars()
                        .mapToObj(n->(char)n).collect(Collectors.groupingBy(s->s, Collectors.counting()));

        System.out.println(map);
    }
}
