import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Get strings that resemble dates in dd-mm-yyyy format.
public class DateString {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("08-01-2001","12-31-2008","56","13-02-2001","3","A4-09-3e04");
        int d=31;
        int m=12;
        List<String>list1=list.stream().
                filter(n->n.contains("-") &&
                        ((n.length()==3) == (n.length()==6))).
                filter(s->s.substring(0,1).chars().allMatch(Character::isDigit) &&
                        s.substring(3,4).chars().allMatch(Character::isDigit)&&
                        s.substring(7,10).chars().allMatch(Character::isDigit)
                ).filter(s->s.substring(0,1).chars().allMatch(n->n>d)).filter(s->s.substring(3,4).chars().allMatch(n->n>m))
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
