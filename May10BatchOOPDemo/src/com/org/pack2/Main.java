package com.org.pack2;
import com.org.pack.SalaryCalculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryCalculator sc;
		sc=new Wipro();
		double salary_Amount=sc.calculateSalary(21000.0,500.0,500.0,2000.0,3000.00,2000.00);
		System.out.println(salary_Amount);
		sc.display();
		sc=new Capgemini();
		double salary_AmountCap=sc.calculateSalary(35000.0,500.0,500.0,2000.0,3000.00,2000.00);
		System.out.println(salary_AmountCap);
		sc.display();
		
	}

}
