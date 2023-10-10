package Preparation;

import java.util.Objects;

public class Employee {
	private String name;
	private int empId;
	private int salary;
	private String designation;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Employee(String name, int empId, int salary, String designation, String location) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.designation = designation;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + ", designation=" + designation
				+ ", location=" + location + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(designation, empId, location, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(designation, other.designation) && empId == other.empId
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& salary == other.salary;
	}
	
	

}
