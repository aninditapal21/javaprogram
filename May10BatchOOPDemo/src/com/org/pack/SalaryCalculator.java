package com.org.pack;
//
public interface SalaryCalculator {
	public double calculateSalary(double basicPAy,double pf,double hra,double ta,double ma,double tds);
	
	default void display() {
		System.out.println("Good Moring");
	}
}
