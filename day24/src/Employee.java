//total employee, gender wise employee, highest salary
import java.util.*;
class Emp_list{
    int id;
    int salary;
    String name;
    String Gender;
    String Date;

    public Emp_list(int id, String date, String gender, String name, int salary) {
        this.id = id;
        Date = date;
        this.salary = salary;
        this.name = name;
        Gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return Date;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return Gender;
    }

    @Override
    public String toString() {
        return "Emp_list{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
public class Employee {
    public static void main(String[] args) {
        List<Emp_list> emp= Arrays.asList(new Emp_list(01,"03-04-2024","F","Ankita",25000),
                new Emp_list(02,"08-05-2024","F","Anushka",20000),
                new Emp_list(03,"01-04-2024","M","Sreyan",30000),
                new Emp_list(04,"12-02-2024","F","Riya",12000),
                new Emp_list(05,"23-04-2024","M","Pooja",10000),
        new Emp_list(06,"19-01-2024","F","Srija",20000));


//        int total_emp= emp.size();
//        System.out.println(total_emp);
//        Map<String,Long>GenderCount=emp.stream().collect(Collectors.groupingBy(Emp_list::getGender, Collectors.counting()));
//        System.out.println(GenderCount);
//        Optional<Emp_list> highestSalary=emp.stream().reduce((n, n1)->n.salary> n1.salary?n:n1);
//        System.out.println(highestSalary);



        Optional<Emp_list> highestSalaryMale=emp.stream()
                .filter(s->s.getGender()=="M")
                .max((n, n1)->n.salary>n1.salary?n.salary:n1.salary);

        Optional<Emp_list> highestSalaryFemale=emp.stream()
                .filter(s->s.getGender()=="F")
                .max((n, n1)->n.salary>n1.salary?n.salary:n1.salary);

        System.out.println(highestSalaryMale);
        System.out.println(highestSalaryFemale);

        emp.stream().sorted(Comparator.comparing(s->s.Date.substring(1,2)))
                .sorted(Comparator.comparing(s->s.Date.substring(4,5)))
                .sorted(Comparator.comparing(s->s.Date.substring(7,10)))
                .skip(emp.size()-1)
                .forEach(System.out::print);

    }
}
