package day12;

import java.util.Arrays;
import java.util.List;

public class Emp {
	    private String name;
	    private double salary;

	    // Constructor
	    public Emp(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    // Getters and Setters (optional but recommended)
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // Override toString() for better printing (optional but recommended)
	    @Override
	    public String toString() {
	        return "Emp{name='" + name + "', salary=" + salary + "}";
	    }

	public static void main(String[] args) {
		List<Emp> emp = Arrays.asList(
	            new Emp("Alice", 5000),
	            new Emp("Bob", 6000),
	            new Emp("Charlie", 7000)
	        );
		for(Emp e:emp) {
			System.out.println(e);
		}
	}
}
