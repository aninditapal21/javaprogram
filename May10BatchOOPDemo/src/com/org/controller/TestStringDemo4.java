package com.org.controller;

import java.util.Arrays;
import java.util.Scanner;

public class TestStringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//toCharArray()
		
		String str="Ravi kumar";
		char []ch=str.toCharArray();
		
		
		//getByte()
		byte[]b=str.getBytes();
		System.out.println(Arrays.toString(b));
		for(int i=0;i<ch.length;i++)
			System.out.println((int)ch[i]);
		
		
		//replace()
		String msg="Hello world";
		String updatedmsg=msg.replace("world", "Anindita");
		System.out.println(updatedmsg);
		
		//replaceAll()
		String name="Ravi Kumar";
		String newName=name.replaceAll("[AEIOUaeiou]","#");
		System.out.println(newName);
		
		//user email id and user phone number i want to genarate one unique password
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email id");
		String emailId=sc.nextLine();
		System.out.println("Enter customer phone number");
		long phone=sc.nextLong();
		
		//substring(int index)----String;
		//substring(int beg,int end)-----string
		String email1=emailId.substring(0,8);
		String ph=String.valueOf(phone);//lobg convert to String
		String phoneNum=ph.substring(ph.length()-4);
		
		String password=email1.concat(phoneNum);
		System.out.println("your password is "+password);
		
	}

}
