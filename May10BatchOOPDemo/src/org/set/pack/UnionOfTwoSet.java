package org.set.pack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class UnionOfTwoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Set<String> set1=new HashSet();
		Set<String>set2=new HashSet();
		System.out.println("Enter the number of top run scorers in season 4");
		int n1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the name of players");
		for(int i=0;i<n1;i++) {
			String player=sc.nextLine();
			set1.add(player);
		}
		System.out.println("Enter the number of top run scorers in season 5");
		int n2=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the name of players");
		for(int i=0;i<n2;i++) {
			String player=sc.nextLine();
			set2.add(player);
		}
		System.out.println("Player Set 1");
		for(String p:set1)
			System.out.println(p);
		System.out.println("Player Set 2");
		Iterator<String> itr=set2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		set1.addAll(set2);
		System.out.println("Union");
		for(String s:set1)
			System.out.println(s);
			
	}

}
