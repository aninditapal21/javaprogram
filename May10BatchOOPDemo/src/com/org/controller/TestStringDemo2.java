package com.org.controller;

import java.util.Scanner;

public class TestStringDemo2 {

	public static void main(String[] args) {
		//Data source
		String[]user= {"admin","customer","suppiler"};
		String[]passcode= {"andmin123","xyz345","password123"};
		//login
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name");
		String userName=sc.nextLine();//admin
		System.out.println("Enter the password");
		String pass=sc.nextLine();//admin123
		
		//checking
		int flag=0;
		for(int i=0;i<user.length;i++) {
			if(user[i].equalsIgnoreCase(userName) && passcode[i].equals(pass)) {
				//System.out.println("You are valid user");
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("You are valid user");
			//"admin".indexOf('a')
			//char charAt(2)
			char ch=userName.charAt(2);
			System.out.println(ch);
			//int indexOf(char ch)
			//int indexOF(String str)
			int index1=userName.indexOf(ch);
			System.out.println("Index1 "+index1);
			//I want to fetch the character from string which is there at last position
			char ch1=userName.charAt(userName.length()-1);
			System.out.println(ch1);
			int index2=userName.indexOf(ch1);
			System.out.println("Index2 "+index2);
			//andmin123
			char ch3=pass.charAt(1);
			System.out.println(ch3);
			int index3=pass.lastIndexOf(ch3);
			System.out.println("Index3 "+index3);
			
			char ch4=pass.charAt(pass.length()-2);
			System.out.println(ch4);
			int index4=pass.indexOf(pass.charAt(pass.length()-2));
			System.out.println("Index4 "+index4);
			
			
			
			//convert any tyeo convert into string
			//String valueOf(int )
			String sIndex1=String.valueOf(index1);
			String sIndex2=String.valueOf(index2);
			String sIndex3=String.valueOf(index3);
			String sIndex4=String.valueOf(index4);
			//2457
			//String concat(String)
			
			//System.out.println(sIndex1+sIndex2+sIndex3+sIndex4);
			System.out.println(sIndex1.concat(sIndex2).concat(sIndex3).concat(sIndex4));
		}
		else
			System.out.println("not valid");
			
		

	}

}
