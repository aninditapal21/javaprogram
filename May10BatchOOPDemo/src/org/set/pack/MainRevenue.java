package org.set.pack;

import java.util.Scanner;
import java.util.TreeSet;

public class MainRevenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeSet<Revenue> revenue=new TreeSet();
		
		int totalAmount=0;	
		while(true) {
		Revenue rev;
		System.out.println("Enter revenue category");
		String revCategory=sc.nextLine();
		System.out.println();
		System.out.println("Enter revenue amount");
		int revAmount=Integer.parseInt(sc.nextLine());
		rev=new Revenue(revCategory,revAmount);
		revenue.add(rev);
		totalAmount+=rev.getAmount();
		System.out.println("Do you want to continue(yes/no):");
		String chk=sc.nextLine();
		if(chk.equalsIgnoreCase("No")) {
			System.out.println("Top spending categories");
			break;
		}
			
		}
		System.out.println(String.format("%-15s%-15s","Category", "Amount"));
		for(Revenue r:revenue) {
			System.out.println(r.getRevenueCategory()+ "   "+r.getAmount());
		}
		System.out.println("Total amount earned: "+totalAmount);
			
	}

}
