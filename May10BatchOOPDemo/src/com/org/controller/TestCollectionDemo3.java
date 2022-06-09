package com.org.controller;

import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class MyClass{
	public static String searchByName(List<String> name,String searchName) {
		for(int i=0;i<name.size();i++) {
			if(name.get(i).equals(searchName))
				return searchName;
		}
		return "abc";
			
	}
	
	public static List<String> removeByName(List<String> names,String removeName) {
		for(int i=0;i<names.size();i++) {
			if(names.get(i).equals(removeName)) {
				int index=names.indexOf(removeName);
				names.remove(index);
				//System.out.println(str);
			}
		}
		return names;
			
	}
	public static List<String> meargeList(List<String>list1){
		List<String>list2=new ArrayList();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		list2.addAll(list1); //add two list 
		//list2.retainAll(list1); //common part of two list is showing
		//list2.removeAll(list1); //uncomon part two list is showing.
		return list2;
	}
	
	public static Object[] converToArray(List<String> names)
	{
		Object[] str=names.toArray();
		return str;
		
	}
	public static List<String> sortByName(List<String> names){
		Collections.sort(names);
		return names;
	}
	public static List<String> updateList(List<String> names,int index, String newName)
	{
		
		/*StringBuffer sb=new StringBuffer("hi");
		sb.replace(0,1,"A");
		System.out.println(sb);*/
		names.set(index, newName);
		 
		return names;
		
	}
	
}

public class TestCollectionDemo3 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*add(Object obj)----boolaen
		 * get(int index)--------object
		 * contains(Object obj)-----------boolean
		 * size()----------int
		 * iteretor()--------Iterator(hasnext(),next(),remove())
		 * remove()
		 * toArray()---------Object[]
		 * indexOf()
		 * lastIndexOf()
		 * set(int index,Object obj)
		 * addAll(collection)
		 *retainAll(Collection)
		 *remoneAll(Collection) 
		 * 
		 * 
		 * 
		 * 
		 * */
		List<String>listOfName1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name into list");
		for(int i=0;i<5;i++) {
			String name=sc.nextLine();
			listOfName1.add(name);
		}
		for(String i:listOfName1)
			System.out.println(i);
		System.out.println("searching by names......................");
		System.out.println("Enter search name");
		String searchName=sc.nextLine();
		String n1=MyClass.searchByName(listOfName1,searchName);
		System.out.println(n1);
		
		System.out.println("Remove by name....................");
		System.out.println("Enter the name you want to remove.");
		String removeName=sc.nextLine();
		List<String> resultList=MyClass.removeByName(listOfName1, removeName);
		System.out.println("After removing the name ");
		System.out.println(resultList);
		
		
		System.out.println("After marging two List............");
		List<String> finalList=MyClass.meargeList(listOfName1);
		for(String i:finalList)
			System.out.println(i);
		
		System.out.println("Converting list into static array..........");
		Object[] resultArray=MyClass.converToArray(listOfName1);
		for(Object s:resultArray)
			System.out.println(s);
		
		System.out.println("sort list...");
		List<String> finalList1=MyClass.sortByName(listOfName1);
		for(String s:finalList1)
		{
			System.out.println(s);
		}
		
		
		System.out.println("after update list...");
		List<String> finalList2=MyClass.updateList(listOfName1,3, "TTT");
		for(String s:finalList2)
		{
			System.out.println(s);
		}
		

	}

}
