import java.util.*;
import java.util.stream.Collectors;

//Retrieve the top 3 highest salaries from a list of Employee.
class Emp1 {
    public String name;
    public String dept;
    public int salary;

    public Emp1(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() { return dept; }
    public int getSalary(){ return salary; }
    @Override
    public String toString() {
        return "Emp1{name='" + name + "', dept='" + dept + "', salary=" + salary + "}";
    }
}
public class ThreeHighestSalary {
    public static void main(String[] args) {
        List<Emp1> emp= Arrays.asList(new Emp1("Ankita","Java",1000),
                new Emp1("Deblina","Python",8000),
                new Emp1("Akash","Java",12000),
                new Emp1("Rakesh","Java",8000));
        List<Emp1> HighestSalaries= emp.stream().
                sorted(Comparator.comparing(Emp1::getSalary).reversed()).
                limit(3).collect(Collectors.toList());
        System.out.println(HighestSalaries);
    }
}

