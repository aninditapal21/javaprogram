package com.org.controller;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetDemo2 {
	
	static Set<String> set;
	public static void setData(Set<String> setReg)
	{
		set=setReg;
	}
	
	public static Set<String> viewAll()
	{
		return set;
	}
	
	public static TreeSet<String> sortSet()
	{
		TreeSet<String> ts=new TreeSet(set);
		return ts;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 5 registartion  numbers for student");
		Set<String> set1=new HashSet();
		for(int i=0; i<5;i++)
		{
			String regNo=scanner.nextLine();
			set1.add(regNo);
		}
		
		setData(set1);
		Set<String> view=viewAll();
		System.out.println(view);
		
		TreeSet<String> sortset= sortSet();
		System.out.println(sortset);
		
		
		
		
		
	}

}
