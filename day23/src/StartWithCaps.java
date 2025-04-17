import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Get all strings that start with a capital letter.
public class StartWithCaps {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("We","am","I","Us","are");
        //Optional<String>S= list.stream().filter(s-> s.contains(s.toUpperCase())).findFirst();
        List<String>list2=list.stream().
                filter(s->s.chars().anyMatch(Character::isUpperCase)).collect(Collectors.toList());
        System.out.println(list2);
    }
}
