import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter strings that look like mobile numbers (10 digits).
public class PhoneNoInStrings {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("1291233400","6775","9123456789","68","3567843219");
        List<String>list1=list.stream().filter(s-> s.chars().count()==10).collect(Collectors.toList());
        System.out.println(list1);
    }
}
