package org.collection.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainOddEven {
	public static List<Integer> generateOddEvenList (List<Integer> listOdd, List<Integer>listEven){
		List<Integer>addList=new ArrayList();
		
		for(int i=0;i<listEven.size();i++) {
			if(listEven.indexOf(listEven.get(i))%2==0)
				addList.add(listEven.get(i));
			else
				addList.add(listOdd.get(i));
		}
		/*for(int i=0;i<listOdd.size();i++) {
			if(listOdd.indexOf(listOdd.get(i))%2!=0)*/
				
		
		return addList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> listOddNum=new ArrayList();
		List<Integer> listEvenNum=new ArrayList();
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		System.out.println("Enter number in first Array");
		for(int i=0;i<n;i++) {
			int num1=sc.nextInt();
			listOddNum.add(num1);
		}
		System.out.println("Enter number in Second Array");
		for(int i=0;i<n;i++) {
			int num2=sc.nextInt();
			listEvenNum.add(num2);
		}
		List<Integer> finalList=generateOddEvenList(listOddNum,listEvenNum);
		for(Integer i:finalList)
			System.out.println(i);
			
	}

}
