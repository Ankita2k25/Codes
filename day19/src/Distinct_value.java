import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct_value {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3);
        List<Integer> distinct = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinct);
    }
}
