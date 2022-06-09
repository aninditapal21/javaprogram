package com.org.serviceimpl;
import java.util.Scanner;

import com.org.service.Validate;

public class ValidateUtility{

	public static Validate validateEmployeeName() {
		Validate v=(name)->{
			String regexForName="[a-zA-Z\\s]{5,20}";
			if(name.matches(regexForName))
				return true;
			return false;
		};
		return v;
	} 
	public static Validate validateProductName() {
		Validate v=(name)->{
			String regexForProductName="[a-zA-Z]{1}[0-9]{5}";
			if(name.matches(regexForProductName))
				return true;
			return false;
		};
		return v;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		String eName=sc.nextLine();
		System.out.println("Enter Product name");
		String pName=sc.nextLine();
		Validate validate1=validateEmployeeName();
		Validate validate2=validateProductName();
		if(validate1.validateName(eName))
			System.out.println("Employee name is valid");
		else 
			System.out.println("Employee name is invalid");
		if(validate2.validateName(pName))
			System.out.println("Product name is valid");
		else 
			System.out.println("Product name is invalid");
	}

}
