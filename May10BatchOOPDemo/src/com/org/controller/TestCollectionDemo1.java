package com.org.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestCollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//collection is an interface
		 //List<interface> inherited cllection interface
		//ArrayList<class>
		//LinkList<class>
		//Stack<class>
		//Vector<class>
		
		List list=new ArrayList();
		//add,remove,search,update sort,fech
		list.add(100);
		list.add(true);
		list.add("abc");
		list.add(56.8f);
		//size() return size of the list
		int size=list.size();
		System.out.println(size);
		//I want to check list contained "abc object or not
		//boolean contains(Object obj)
		
		boolean status=list.contains("abc");
		System.out.println(status);
		if(status) {
			/*for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));*/
			/*for(Object obj:list)
				System.out.println(obj);*/
			
			Iterator itr=list.iterator();
			
			//hasnext()--method return true if the element is present of this list or not if not then return false.
			//next()----method move to the next element
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}
		
		
		//linkedlist data structure
		//listOfName=new LinkList();
		
	}

}
