package org.set.pack;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class sortBestRider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Set<String> player=new TreeSet();
		System.out.println(" enter the number of matches");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			String pl=sc.nextLine();
			player.add(pl);
		}
		for(String s:player)
			System.out.println(s);
			
		
		
	}

}
