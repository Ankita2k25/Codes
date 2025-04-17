import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter strings that contain special characters.
public class SpecialCharacter {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("A@","B%R","##","Q*","7u","8ik","9");
        List<String>str= list.stream().filter(s->s.chars().allMatch(Character::isLetterOrDigit)).
                collect(Collectors.toList());
        System.out.println(str);

    }
}
