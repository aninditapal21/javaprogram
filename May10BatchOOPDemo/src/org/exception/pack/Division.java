package org.exception.pack;

import java.util.Scanner;

public class Division {
	String str="";
	public String divideTwoNumbers(int number1,int number2) {
		double result=0.0;
		try {
			result=number1/number2;
			return str+"The answer is "+result;
		}
		catch(ArithmeticException e) {
			return str+"Division by zero is not possible";
		}
		finally {
			System.out.println( str+"Thanks for using the application.");;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		Division d=new Division();
		System.out.println("Enter the numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(d.divideTwoNumbers(n1,n2));
		
	}

}
