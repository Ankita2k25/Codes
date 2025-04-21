import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group employees by department and calculate average salary.
 class Emp {
    public String name;
    public String dept;
    public static int salary;

    public Emp(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() { return dept; }
    public int getSalary(){ return salary; }
    @Override
    public String toString() {
        return "Emp{name='" + name + "', dept='" + dept + "', salary=" + salary + "}";
    }
}
public class GroupEmployees {
    public static void main(String[] args) {
        List<Emp>emp=Arrays.asList(new Emp("Ankita","Java",0000),new Emp("Deblina","Java",5000),new Emp("Rakesh","Java",5000));
        Map<String, Double> list = emp.stream()
                .collect(Collectors.groupingBy(
                        Emp::getDept,
                        Collectors.averagingInt(Emp::getSalary)
                ));
        System.out.println(list);
    }
}
