import java.util.Arrays;
import java.util.List;

public class SecondHighestValue {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,9,2,7,9);
        int Highest=0;
        int Second_Highest=0;
        if(list.size()<2)
        {
            System.out.println("You should provide atleast 2 numbers");
        }
        for (int n: list) {
            if (n > Highest) {
                Second_Highest = Highest;
                Highest=n;
            } else if (n > Second_Highest && n != Highest) {
                Second_Highest = n;
            }
        }

        System.out.println(Integer.valueOf(Second_Highest));
    }
}
