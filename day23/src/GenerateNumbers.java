import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Generate numbers from 1 to 10 and collect them into a list.
public class GenerateNumbers {
    public static void main(String[] args) {
        List<Integer> list= IntStream.range(1,11).boxed()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
