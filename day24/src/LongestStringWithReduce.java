import java.util.Arrays;
import java.util.List;

//Find the longest string in a list using reduce()
public class LongestStringWithReduce {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Ankita","Manu","Ank","Sauravi");
        String longest=list.stream().reduce("",(n,n1)->n.length()>n1.length()?n:n1);
        System.out.println(longest);
    }
}
