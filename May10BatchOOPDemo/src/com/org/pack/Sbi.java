package com.org.pack;
import java.util.Date;

public class Sbi extends RbiBank{
	
	
	public Sbi(String msg){
		super(msg);
	}
	@Override
	boolean getBanking(RbiBank rbi) {
		if(rbi instanceof Sbi) {
			return true;
		}
		return false;
		
	}
	public void displayDate() {
		System.out.println(new Date());
	}
}
