import java.util.*;
//Write a Java program that takes a list of integers and returns the second highest number from the list.
public class SecondHighestUsingSort {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,1,2,9,7,7,9,9);
        if(list.size()<2)
        {
            System.out.println("You should provide atleast 2 numbers");
        }
        Set<Integer> List2=new HashSet<>(list);
        List<Integer>NewList=new ArrayList<>(List2);
        System.out.println(NewList.get(NewList.size()-2));
    }
}
