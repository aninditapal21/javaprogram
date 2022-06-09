package com.org.controller;

import java.util.Scanner;
class Employee{
	int empId;
	String empName;
	double salary;
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
}

public class TestStringDemo3 {
	
	public static boolean checkFeedback(String feedback) {
		if(feedback.length()>=4)
			return true;
		else
			return false;
	}
	public static boolean checkRemarks(String remarks) {
		//session was good .we learned java.java is simple.
		//String[]split(String regex)
		//return type of split method is character Array
		String [] result=remarks.split("[\\.]");
		for(String str:result)
			System.out.println(str);
		if(result!=null) {
			if(result.length>=2)
				return true;
		}
		return false;
	}

	public static Employee getEmployeeInfo(String employeeInfo) {
		//102,Ravi,345.67
		// 0    1        2
		//102  Ravi   345.67
		String []empResult=employeeInfo.split(",");
		int empId=Integer.parseInt(empResult[0]);
		String empName=empResult[1];
		double salary=Double.parseDouble(empResult[2]);
		Employee e=new Employee(empId,empName,salary);
		return e;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//working feedback management system
		//I am getting feedback from customer as a string
		//i have to whether feedback length is more the 4 characters or not
		//remarks section it should contain at least 4 sentences.
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your feedback");
		String feedbackMsg=sc.nextLine();
		System.out.println("Enter your remarks");
		String remarks=sc.nextLine();
		
		boolean chkFeedback=checkFeedback(feedbackMsg);
		
		if(chkFeedback)
			System.out.println("valid feedback");
		else
			System.out.println("not valid");
		
		
		boolean rmrks=checkRemarks(remarks);
		if(rmrks)
			System.out.println("valid remarks");
		else 
			System.out.println("invalid remarks");
		
		
		System.out.println("Enter Employee details separeted by , :");
		String emplnfo=sc.nextLine();
		Employee e=getEmployeeInfo(emplnfo);
		System.out.println(e);
		
		

	}

}
