package org.exception.pack;

import java.util.Scanner;

public class CandidateMain {
	
	static Scanner sc=new Scanner(System.in);
	public static Candidate getCandidateDetails() throws InvalidSalaryException {
		Candidate can=new Candidate();
		System.out.println("Enter the candidate details");
		System.out.println("Name");
		String name=sc.nextLine();
		can.setName(name);
		System.out.println("Gender");
		String gen=sc.nextLine();
		can.setGender(gen);
		System.out.println("Expected Salary");
		double sal=sc.nextDouble();
		can.setExpectedSalary(sal);
		if(can.getExpectedSalary()<10000)
			throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000");
		return can;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Candidate can=getCandidateDetails();
			if(can!=null)
				System.out.println("Registration Successful");
				
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
