package day12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Convert a List to a Map
//
//Given a list of employees with their names and salaries, convert it into a Map<String, Double> where the key is the name and the value is the salary.
//java
//Copy code
//class Employee {
//    String name;
//    double salary;
//    // Constructor, Getters, and Setters
//}
//List<Employee> employees = Arrays.asList(
//    new Employee("Alice", 5000),
//    new Employee("Bob", 6000),
//    new Employee("Charlie", 7000)
//);

public class Task8 {
public static void main(String[] args) {
	List<Emp> emp = Arrays.asList(
            new Emp("Alice", 5000),
            new Emp("Bob", 6000),
            new Emp("Charlie", 7000)
        );
	Map<String, Double> employeeMap = emp.stream()
            .collect(Collectors.toMap(
                Emp::getName,  // Key: Employee's name
                Emp::getSalary  // Value: Employee's salary
            ));
	System.out.println(employeeMap);
}
}
