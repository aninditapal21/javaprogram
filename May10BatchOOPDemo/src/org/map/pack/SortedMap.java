package org.map.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortedMap {
	
	static HashMap<Integer,Integer>mapList=new HashMap();
	public static List<Integer> getValues(HashMap<Integer,Integer> map){
		Set<Integer>setOfValues=map.keySet();
		Iterator<Integer> itr=setOfValues.iterator();
		List<Integer> sortList=new ArrayList();
		while(itr.hasNext()) {
			int k=itr.next();
			int value=map.get(k);
			sortList.add(value);
			Collections.sort(sortList);
		}
		return sortList;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of map");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Enter the key");
			int key=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the value");
			int value=Integer.parseInt(sc.nextLine());
			mapList.put(key, value);
		}
		
		getValues(mapList).forEach(m->System.out.println(m));
		
	}

}
