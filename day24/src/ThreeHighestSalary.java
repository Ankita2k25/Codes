import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Retrieve the top 3 highest salaries from a list of Employee.
public class ThreeHighestSalary {
    public static void main(String[] args) {
        List<Emp> emp= Arrays.asList(new Emp("Ankita","Java",1000),
                new Emp("Deblina","Java",8000),
                new Emp("Akash","Java",12000),
                new Emp("Rakesh","Java",8000));
        List<Emp> HighestSalaries= emp.stream().
                sorted(Comparator.comparing(Emp::getSalary).reversed()).
                limit(3).collect(Collectors.toList());
        System.out.println(HighestSalaries);
    }
}
