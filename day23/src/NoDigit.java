import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get strings that do not contain any digits.
public class NoDigit {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("t5","33","iu","9o","edd");
        List<String>list1=list.stream().filter(n->!n.chars().anyMatch(Character::isDigit)).collect(Collectors.toList());
        System.out.println(list1);
    }
}
