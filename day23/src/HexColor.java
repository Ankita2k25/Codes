import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Find strings that look like hex color codes (e.g., #AABBCC).
public class HexColor {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("#A10000","B42900","1345","#DFA000","#AAVAT9","#1234AA","#S23451");
        list.stream().
                filter(l->l.length()==7 && l.startsWith("#") && l.substring(1).chars()
                        .allMatch(c->Character.isDigit (c) || Character.isAlphabetic(c)  && c >= 'A' && c <= 'F'))
                .forEach(System.out::println);
    }
}
