package com.org.pack2;

import com.org.pack.SalaryCalculator;

public class Wipro implements SalaryCalculator{
	public double calculateSalary(double basicPay,double pf,double hra,double ta,double ma,double tds) {
		double sal=(basicPay+pf+hra+ma)-(pf+tds);
		return sal;
	}
}
