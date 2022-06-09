package org.map.pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainOddAvg {
	
	public static int getAverageOfOdd(Map<Integer,Integer> list) {
		Set<Integer> setOfKey=list.keySet();
		Iterator<Integer> itr=setOfKey.iterator();
		int sum=0;
		int count=0;
		while(itr.hasNext()) {
			int key=itr.next();
			if(key%2!=0) {
				sum+=list.get(key);
				count++;
			}
		}
		int avg=(int)(sum/count);
		return avg;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> list=new HashMap();
		System.out.println("Enter the size of list:");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Enter the key value");
			int key=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the value:");
			int value=Integer.parseInt(sc.nextLine());
			list.put(key, value);
		}
		int avgOdd=getAverageOfOdd(list);
		System.out.println("sum of odd is:"+avgOdd);
	}

}
