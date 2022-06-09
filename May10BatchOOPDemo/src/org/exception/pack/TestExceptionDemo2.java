package org.exception.pack;

import java.util.Arrays;
import java.util.Scanner;

public class TestExceptionDemo2 {

	static String name="ABC";
	static Scanner sc=new Scanner(System.in);
	public static void getData(int[] arr) {
		try {
		arr[5]=100;//array index out of bound exception
		System.out.println(Arrays.toString(arr));
		String n=name.substring(1); //null pointer
		System.out.println(n);
		
		System.out.println("Enter a number");//NumberFormat
		String num=sc.nextLine();
		int n1=Integer.parseInt(num);
		System.out.println(n1);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Enter valid size of the array, size should be more than 5");	
			main(null);
		}
		catch(NullPointerException nulle) {
			 System.out.println("Assign value in name object");
			  main(null);
		}
		catch(NumberFormatException ne) {
			System.out.println("please give valid input as number");
			  //main(null);
		}
		catch(Exception e) {
			System.out.println("for other error");
		}
		finally
		{
			System.out.println("I am from finally block");
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array");
		int size=Integer.parseInt(sc.nextLine());
		System.out.println("Enter elements into array");
		int[]num=new int[size];
		for(int i=0;i<num.length;i++)
			num[i]=Integer.parseInt(sc.nextLine());
		getData(num);
	}

}
