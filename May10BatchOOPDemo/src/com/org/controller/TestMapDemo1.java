package com.org.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 *   Map<interface>
 *   |
 *   1.In map we are storing object as key and Value
 *   
 *   
 *   HashMap<class>
 *   LinkedHashMap<class>
 *   |
 *   SortedMap<interface>
 *   |
 *   NavigableMap<interface>
 *   |
 *   TreeMap<class>
 * 
 * 
 * 
 * 
 */
public class TestMapDemo1 {

	public static void main(String[] args) {
 //key --Object , Value --Object
		/*
		 * HashMap()--
		 * HashMap(int capacity)
		 * HashMap(int capcity, float load factor)
		 * HashMap(Map m)
		 * 
		 * 
		 */
		//empty hashmap object and initialized with Map reference
 // Map<Integer, String> map1=new HashMap<Integer, String>();
		//Map<Integer, String> map1=new LinkedHashMap<Integer, String>();
		Map<Integer, String> map1=new TreeMap<Integer, String>();
		//add object as key and value
  //put(Object as Key, Object as value)---Object as value
  map1.put(101, "A");
  map1.put(2,"C");
  map1.put(101, "T");
  map1.put(788, "C");

  //System.out.println(map1);
  //size() ---int
  System.out.println(map1.size());
  //keySet()---Set<Object)
 Set<Integer>  setOfKey=map1.keySet();
 //iterator can not be invoked with map object only we can able invoke using collection obejct 
 //
 /* Iterator<Integer> itr=setOfKey.iterator();
  while(itr.hasNext())
  {
	  int key=itr.next();
	  // get(int index)
	  //get(Object key)--Value as Object
	 
	String value=   map1.get(key);
	System.out.println(key+ "--->"+value);
  }*/
  /*
   * interface Map
   *    {
   *     //some methods
   *     interface Entry
   *     {
   *     
   *     //some method s
   *     
   *     
   *     }
   * 
   * 
   * 
   * 
   */
 Set<Entry<Integer, String>> setOfEntry=   map1.entrySet();
  
   for(Map.Entry<Integer, String>  me  :setOfEntry)
   {
	   
	   
	   System.out.println(me.getKey() +" "+me.getValue());
   }
  
  
  // all values from map I want conevrt into collection
  Collection<String> collectionOfValues=   map1.values();
  
  LinkedList<String> list1=new LinkedList(collectionOfValues);
  for(String s: list1)
  {
	  System.out.println(s);
  }
  
  //if you want to search whether the map contains that value or not
  //containsKey(Object obj) --boolean
 if( map1.containsKey(101))
 {
	 if(map1.containsValue("C"))
	 {
		 //replace 
		 map1.replace(101, "XYZ");
	 }
 }
 System.out.println("after replacing....");
 Set<Entry<Integer, String>> setOfEntry1=   map1.entrySet();
 
 for(Map.Entry<Integer, String>  me  :setOfEntry1)
 {
	   
	   
	   System.out.println(me.getKey() +" "+me.getValue());
 }
 
//remove(Object key)--String
 //String s=map1.remove(2);
 if(map1.remove(2,"C"))
 {
 System.out.println("removed object is");
 }
 System.out.println(map1);
 
 

 
  
  
  
  
  
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
