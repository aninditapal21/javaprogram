package org.exception.pack;
/*Exception is an abnormal code behaviour
 * in java exception is an object
 * java.lang is the default package
 * Throwable is the root class of Exception<class>
 * 1.Exception<class>;
 * 		1.checkExceptrion or compile time exception(
 * 			a.FileNotFoundException
 * 				File("D:/a.txt")
 * 			b.SQLException
 * 			c.ClassException
 * 		2.uncheckException or run time exception-----this is handle by jvm at runtime
 * 			a.ArithmeticException
 * 			b.ArrayOutofBoundException
 * 			c.NullPointerException
 * 
 * 
 * handel the exception we use 5 keyword
 * 	a.try{
 * 		s1;null pointer
 * 		s2;
 * 		}
 * 	b.catch(Exception e){
 * 		System.out.println(e);
 * 	}
 * 	c.throws
 * 	d.thow
 * 	e.finaly
 * 2.Error<class>;
 * 
 * */
import java.util.Scanner;

public class TextExceptionDemo1 {
	public static int calculateDivision(int number1,int number2){
		int result=0;
		try {
			 result=number1/number2;//new ArithmeticException
		}
		catch(ArithmeticException e) {
			System.out.println("Give number 2 as greater than zeros");
			main(null);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1=sc.nextInt();
		System.out.println("Enter number 2:");
		int num2=sc.nextInt();
		System.out.println(calculateDivision(num1,num2));
		
		
		
	}

}
