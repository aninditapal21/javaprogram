package org.map.pack;

public class Employee {
	private int empId;
	private String designation;
	private int salary;
	public Employee(int empId, String designation, int salary) {
		super();
		this.empId = empId;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
