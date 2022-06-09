package org.collection.pack;

import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList();
		System.out.println("Enter the the number of matches played by Raina.");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter run ");
		for(int i=0;i<n;i++) {
			int run=sc.nextInt();
			list.add(run);
		}
		Collections.sort(list);
		for(Integer i:list)
			System.out.println(i);
			
		
	}

}
