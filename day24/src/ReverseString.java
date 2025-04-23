import java.util.Arrays;
import java.util.List;

//Reverse sort strings by their last character.
public class ReverseString {
    public static void main(String[] args) {

                List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

                // Sorting using Comparator
                list.sort((s1, s2) -> {
                    // Compare by last character in reverse order
                    char lastChar1 = s1.charAt(s1.length() - 1);
                    char lastChar2 = s2.charAt(s2.length() - 1);
                    return Character.compare(lastChar2, lastChar1); // reverse order
                });

                System.out.println(list);
    }
}

