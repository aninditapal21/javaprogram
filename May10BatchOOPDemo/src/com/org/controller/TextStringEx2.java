package com.org.controller;

import java.util.Scanner;

public class TextStringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//replace
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter team details");
		String team=sc.nextLine();
		String updateteam=team.replace("Captain","Skipper");
		System.out.println("After replacement");
		System.out.println(updateteam);*/
		
		
		//substring()
		/*System.out.println("Enter Player name");
		String name=sc.nextLine();
		System.out.println("Enter starting index");
		int indexpos=sc.nextInt();
		String shortName=name.substring(indexpos);
		System.out.println("Short name of "+name+": "+shortName);*/
		
		
		/*System.out.println("Enter team name");
		String teamName=sc.nextLine();
		System.out.println("Enter starting index of the sequence");
		int srtIndex=sc.nextInt();
		System.out.println("Enter ending index of the sequence");
		int endIndex=sc.nextInt();
		String newname=teamName.substring(srtIndex,endIndex);
		System.out.println(newname);*/
		
		

		/*System.out.println("Enter the number of players");
		int n=sc.nextInt();
		sc.nextLine();
		String[]player=new String[n];
		System.out.println("Enter players names");
		for(int i=0;i<player.length;i++)
			player[i]=sc.nextLine();
		
		for(int i=0;i<player.length;i++) {
			if(player[i].contains("Sharma"))
				System.out.println(player[i]);
		}*/
		
		
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		sc.nextLine();
		String[]player=new String[n];
		System.out.println("Enter players names");
		for(int i=0;i<player.length;i++)
			player[i]=sc.nextLine();
		System.out.println("Player name starting with 'M' or Ending with 'a'");
		for(int i=0;i<player.length;i++) {
			if(player[i].startsWith("M")|| player[i].endsWith("a"))
				System.out.println(player[i]);
		}		
	}

}
