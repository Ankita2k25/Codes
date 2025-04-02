package day11;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class SampleStreamApi {
	public static void main(String[] args) {
		        List<Employee> employeeList =new ArrayList<>();
		        employeeList.add(new Employee("1", "Alice", "50000", "New York", "30"));
		        employeeList.add(new Employee("2", "Alice", "60000", "Los Angeles", "35"));
		        employeeList.add(new Employee("3", "Charlie", "55000", "Chicago", "32"));
		        employeeList.add(new Employee("4", "David", "62000", "Houston", "40"));
		        employeeList.add(new Employee("5", "Eve", "58000", "San Francisco", "28"));
		        employeeList.add(new Employee("6", "Frank", "61000", "Seattle", "37"));
	
		        int highestSalary = employeeList.stream()
		                .map(e -> Integer.parseInt(e.getSalary())) 
		                .reduce(0, (max, current) -> current > max ? current : max); // Find max salary

		        System.out.println("Highest Salary: " +highestSalary);
//		        Employee highestSalaryEmployee = employeeList.get(0);
//		        for (Employee e : employeeList) {
//		            if (Integer.parseInt(e.getSalary()) > Integer.parseInt(highestSalaryEmployee.getSalary())) {
//		                highestSalaryEmployee = e;
//		            }
//		        }
//		        System.out.println("Employee with highest salary: " + highestSalaryEmployee);
	}
}
