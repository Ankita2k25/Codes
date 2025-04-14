import java.util.*;

public class SecondHighestUsingSort {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,1,2,9,2,7,9,9);
        Set<Integer> List2=new HashSet<>(list);
        List<Integer>NewList=new ArrayList<>(List2);
        Collections.sort(NewList);
        System.out.println(NewList.get(NewList.size()-2));
    }
}
