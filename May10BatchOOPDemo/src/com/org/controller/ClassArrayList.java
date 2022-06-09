package com.org.controller;

import java.util.List;
import java.util.*;
import java.util.ArrayList;
public class ClassArrayList {
	static  List<Integer >listOfMarks=new ArrayList();
	public  static void addMarks(int k){
	  		listOfMarks.add(k);
	}
	
		
	public static List<Integer> getMarks(){
			
			return listOfMarks;
	}
	public static List<Integer> addGraceMarks(List<Integer>listOfMarks){
			List<Integer >totalMarks=new ArrayList();
			int total=0;
			for(int i=0;i<listOfMarks.size();i++)
			{
				total=total+(listOfMarks.get(i));
				
				
			}
			totalMarks.add(total);
			return totalMarks;
		}
		public static List<Integer> OddMarks(List<Integer>listOfMarks) {
			List<Integer> newList=new ArrayList();
			for(int i=0;i<listOfMarks.size();i++) {
				if(listOfMarks.get(i)%2!=0) {
					newList.add(listOfMarks.get(i));
				}
			}
			return newList;
		}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int count=0;
		System.out.println("enter the size");
		int k=Integer.parseInt(sc.nextLine());
		System.out.println("enter the marks");
		for(int i=0;i<k;i++) {
			
			int marks=Integer.parseInt(sc.nextLine());
			addMarks(marks);
			
		}
		
		List<Integer> ViewMarks=getMarks();
			for(Integer k1:ViewMarks) {
				System.out.println(k1);
			}
			/*Iterator itr= ViewMarks.iterator();
		while(itr.hasNext())
			{
				System.out.println(itr.next());
			}*/
		
		List<Integer> totalMarks=addGraceMarks(listOfMarks);
		Iterator itr1= totalMarks.iterator();
		while (itr1.hasNext()) {
				System.out.println( "total marks is"+" "+itr1.next());
			}
		
		 List<Integer> k1 =OddMarks(listOfMarks);
		 for(Integer m:k1)
			 System.out.println(m);
	/*for(int i=0;i<listOfMarks.size();i++) {
	 
	   System.out.println(k1.get(i));
	}*/
	}

}

