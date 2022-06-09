package com.org.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class TextCollectionDemo2 {

	static List<Integer>listOfMarks=new ArrayList();
	public static void addMarks(int marks) {
		listOfMarks.add(marks);
	}
	public static List<Integer> getMarks(){
		return listOfMarks;
	}
	
	public static List<Integer> listEvenNumber(List<Integer> number){
		List<Integer> evenList=new ArrayList();
		for(int i=0;i<number.size();i++) {
			if(number.get(i)%2==0)
				evenList.add(number.get(i));	
		}
		return evenList;
	}
	public static List<Integer> addGraceMarks(List<Integer> marks)
	{
		List<Integer>graceList=new ArrayList();
		for(int i=0;i<marks.size();i++) {
			if(marks.get(i)<30)
				graceList.add(marks.get(i)+5);	
		}
		return graceList;
		
	}
	
	public static int countOddNumbers(List<Integer> marks)
	{
		int oddCount=0;
		for(int i=0;i<marks.size();i++) {
			if(marks.get(i)%2!=0)
				oddCount++;
		}
		return oddCount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of list");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter marks for subjects"+(i+1));
			int marks=sc.nextInt();
			addMarks(marks);
		}
		List<Integer> viewMarks=getMarks();
		System.out.println("Printing the List");
		for(Integer i:viewMarks)
			System.out.println(i);
		System.out.println("Printing the even number");
		List<Integer>list=listEvenNumber(viewMarks);
		for(Integer i:list)
			System.out.println(i);
		
		System.out.println("Printing Grace List");
		List<Integer>graceList=addGraceMarks(viewMarks);
		for(Integer i:graceList)
			System.out.println(i);
		
		int oddCount=countOddNumbers(viewMarks);
		System.out.println("Odd Count is:"+oddCount);
		
	}

}
