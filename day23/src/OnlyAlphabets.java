import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Get strings that contain only alphabets.
public class OnlyAlphabets {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Arr","9u","iool","65","6r");
        List<String>list1=list.stream().filter(n->n.chars().allMatch(Character::isAlphabetic)).collect(Collectors.toList());
        System.out.println(list1);
    }
}
