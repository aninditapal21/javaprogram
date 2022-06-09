package org.collection.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HighestRun {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		double avg=0.0;
		List<Integer> runList=new ArrayList();
		System.out.println("Enter the to the number of matches played by CSK");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the run");
		for(int i=0;i<n;i++) {
			int run=sc.nextInt();
			runList.add(run);
		}
		for(int i=0;i<n;i++) {
			sum+=runList.get(i);
		}
		avg=(double)sum/n;
		System.out.println(sum);
		System.out.println(avg);
	}

}
