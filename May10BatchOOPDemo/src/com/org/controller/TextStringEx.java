package com.org.controller;

import java.util.Scanner;

public class TextStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter venue1");
		String venue1=sc.nextLine();
		System.out.println("Enter venue2");
		String venue2=sc.nextLine();
		if(venue1.equalsIgnoreCase(venue2))
			System.out.println("Both the venues are same.");
		else
			System.out.println("Both the venues are different");*/
		
		/*System.out.println("Enter team1");
		String team1=sc.nextLine();
		System.out.println("Enter team2");
		String team2=sc.nextLine();
		System.out.println("Enter third character");
		char ch=sc.next().charAt(0);
		int flag=0;
		for(int i=0;i<team1.length();i++) {
			if(team1.charAt(i)==ch) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Winner Team:"+team1);
		for(int i=0;i<team2.length();i++) {
			if(team2.charAt(i)==ch) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Winner Team:"+team2);*/
			
		
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		sc.nextLine();
		String[]player=new String[n];
		for(int i=0;i<player.length;i++)
			player[i]=sc.nextLine();
		
		for(int i=0;i<player.length;i++) {
			if(player[i].indexOf('a')==player[i].lastIndexOf('a')) {
				System.out.println(player[i]);
				break;
			}	
		}
			
	}

}
