package org.set.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MainPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Set<Player> player=new HashSet();
		Player pl;
		System.out.println("Enter number of players:");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Enter player "+ (i+1)+ " detail");
			System.out.println("Enter Name");
			String pName=sc.nextLine();
			System.out.println("Enter Skill");
			String pSkill=sc.nextLine();
			System.out.println("Enter Cap Number");
			long pCapNum=Long.parseLong(sc.nextLine());
			pl=new Player(pName,pSkill,pCapNum);
			player.add(pl);
		}
		List<Player> list=new ArrayList(player);
		Collections.sort(list);
		System.out.println("Player list after sorting by cap number in descending order");
		for(Player p:player)
			System.out.println(p.getPlayerName()+"-"+p.getCapNumer());
		
	}

}
