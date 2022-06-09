package com.org.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Collection<interface>
 *  |
 *  Set<interface>
 *    |
 *    HashSet<class>
 *    LinkedSet<class>
 *    
 *    SortedSet<interface>
 *    |
 *   NavigableSet
 *   |
 *   TreeSet<class>
 * 
 * 
 */
public class TestSetDemo1 {

	public static void main(String[] args) {
		/*  0.75 
		 *    HashSet()
		 *    {
		 *   69609650%16
		 *    16 capacity +17
		 *    ["Hi]-
		 *    [Hello]
		 *    [3]
		 *    [Hello]-4
		 *    
		 *    
		 *     "Hello"--100%16=4
		 *     Hi=12%16=1
		 *     
		 *     equals
		 *    
		 *  HashMap hm=    new HashMap()
		 *      {
		 *      //whether the object is equal or not
		 *      //if object equal the only one hasCode value will be generated
		 *    hm. put(100, ,obj value))
		 *    
		 *      
		 *      }
		 *    
		 *    
		 *    }
		 * 
		 * 
		 * 
		 */
		//empty object of HashSet with capacity 16 and load factor 0.75
		//it's uses HashMap object to store it's element
		//HashSet(Collection colletion)
		//HashSet(int initialCapacity)
		//HashSet(int initialCapacii, float loadfactor)
   Set<Integer> set1=new HashSet();
   set1.add(100);
   set1.add(5);
   set1.add(100);
   set1.add(1);
   set1.add(7654);
   set1.add(51);

   System.out.println("Iterating HashSet.....");
	Iterator<Integer> itr=set1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("Iterating LinkedHashSet.....");	
	set1=new LinkedHashSet<Integer>();
	set1.add(100);
	set1.add(5);
	set1.add(100);
	set1.add(1);
	set1.add(7654);
	set1.add(51);
	Iterator<Integer> itr1=set1.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}	
	System.out.println("Iterating treeset...");
	set1=new TreeSet<Integer>();
	set1.add(100);
	set1.add(5);
	set1.add(100);
	set1.add(1);
	set1.add(7654);
	set1.add(51);
	Iterator<Integer> itr2=set1.iterator();
	while(itr2.hasNext())
	{
		System.out.println(itr2.next());
	}	

	}

}