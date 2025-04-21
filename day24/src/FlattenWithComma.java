import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//Flatten a list of comma-separated strings into a unique list of strings.

        public class FlattenWithComma {
    public static void main(String[] args) {
        List<String> lists= Arrays.asList("1,2","3,4","5","1,2");
        HashSet<String> set=new HashSet<>(lists);
//        String list2=lists.stream()
//                .distinct().
//                collect(Collectors.joining(","));
        String result = lists.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .distinct()
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
