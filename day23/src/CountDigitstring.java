import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get all strings that contain only digits.
public class CountDigitstring {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("123","S1","2","321","yt5");
        List<String>list2=list.stream().
                filter(s->s.chars().allMatch(Character::isDigit)).collect(Collectors.toList());
        System.out.println(list2);
    }
}
