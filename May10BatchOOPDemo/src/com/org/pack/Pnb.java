package com.org.pack;

import java.util.Date;
import java.util.Date;

public class Pnb extends RbiBank {
	public Pnb(String msg){
		super(msg);
	}
	@Override
	boolean getBanking(RbiBank rbi) {
		if(rbi instanceof Pnb) {
			return true;
		}
		return false;
		
	}
	public void displayDate() {
		System.out.println(new Date());
	}
	
	
}
