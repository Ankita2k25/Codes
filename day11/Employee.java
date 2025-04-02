package day11;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String id;
    private String name;
    private String salary;
    private String city;
    private String age;

    public Employee(String id, String name, String salary, String city, String age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", city='" + city + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("1", "Alice", "50000", "New York", "30"));
        employeeList.add(new Employee("2", "Alice", "60000", "Los Angeles", "35"));
        employeeList.add(new Employee("3", "Charlie", "55000", "Chicago", "32"));
        employeeList.add(new Employee("4", "David", "62000", "Houston", "40"));
        employeeList.add(new Employee("5", "Eve", "58000", "San Francisco", "28"));
        employeeList.add(new Employee("6", "Frank", "61000", "Seattle", "37"));
        
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}

