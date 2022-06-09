package com.org.controller;
/*In java String is immutable means we can not change.
 * mutable we can change.
 * */
public class TestStringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * stack        Heap[String pool]
		 * [name1]------>[Objects ["Ravi"]]                     
		 * [name2]------->[102]
		 * both reference same string object. 
		 * 
		 * */
		String name1="Ravi";
		String name2="Ravi";
		String name3=new String("Ravi");//String object creation using new keyword
		if(name1==name3)
			System.out.println("Both address are same");
		else
			System.out.println("not same");
		//return type of equal method is boolean
		if(name1.equals(name3))
			System.out.println("Both value are same");
		else
			System.out.println("value not same");
		char []ch= {'R','a','v','i'};
	}

}
