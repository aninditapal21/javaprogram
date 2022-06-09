package com.org.controller;

import java.util.Scanner;

class Employee123{
	
	
	
	// abc_123-a@gmail.com
			//[A-za-z_0-9#]+[@]{1}[a-zA-z]+[.]{1}[a-zA-z]{3}
	public static boolean verifyEamilFormat(String email) {
		String regexForEmail="[A-Za-z0-9_]+[@]{1}[a-zA-Z]+[.]{1}[a-z]{3}";
		if(email.matches(regexForEmail))
			return true;
		else 
			return false;
			
	}
	//first five character is alphabts and upper case
		//next four character is didgit
		//last character in pan card should be alphabet and upper case
		//ABCDE1234Q
		//[A-Z]{5}[0-9]{4}[A-Z]{1}
	public static boolean varifyPan(String pan) {
		String regexForPan="[A-Z]{4}[0-9]{4}[A-Z]{1}";
		if(pan.matches(regexForPan))
			return true;
		else 
			return false;
	}
	//7 8 9 6
	public static String verifyMobile(String phone)
	{
		String regexForMobile="[7896]{1}[0-9]{9}";
		if(phone.matches(regexForMobile))
			return phone;
		else 
			return null;
		
	}
	//first character should be apphabet and uppercase
	//next two characters shoulbe be digit
	//password must conatin atleast one special character
	//password should have min length shoule be 5
	//the last character in password should be only one alphabet
	public static String verifyPassword(String password)
	{
		String regexForPan="[[A-Z]{1}[0-9]{2}(?=.*[@#$%^&-+=()])[A-Za-z]{1}]{5,}";
		if(password.matches(regexForPan))
			return "valid password";
		else 
			return "Invalid";
		
	}
}
public class TextStringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
		boolean b=Employee123.verifyEamilFormat("Anindita@gamil.com");
		if(b)
			System.out.println("valid email");
		else 
			System.out.println("Invalid email");
		
		boolean b1=Employee123.varifyPan("ABCD1234Q");
		if(b1)
			System.out.println("valid pan");
		else 
			System.out.println("Invalid pan");
		System.out.println("Enter phone number:");
		String phn=sc.nextLine();
		String b3=Employee123.verifyMobile(phn);
		if(phn.equals(b3))
			System.out.println("valid phone number");
		else 
			System.out.println("Invalid phone number");
		
		System.out.println("Enter the password:");
		String passWord=sc.nextLine();
		String b4=Employee123.verifyPassword(passWord);
		System.out.println(b4);
		/*if(passWord.equals(b4))
			System.out.println("valid password");
		else 
			System.out.println("Invalid password");*/
	}

}
