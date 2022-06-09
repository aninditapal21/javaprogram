package com.org.pack;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		RbiBank rbi;
		//upcasting
		//super_type_ref=object of sub_type
		rbi=new Sbi("Welcome to SBI");
		boolean status1=rbi.getBanking(rbi);
		if(status1) {
			System.out.println("Sbi valid bank");
		}
		else
			System.out.println("not valid");
		rbi.displayDate();
		System.out.println(rbi.doLogin(123));
		System.out.println(rbi.withdraw(4000.00));
		
		
		rbi=new Pnb("Welcome to PNB");
		boolean status2=rbi.getBanking(rbi);
		if(status1) {
			System.out.println("pnb valid bank");
		}
		else
			System.out.println("not valid");
		rbi.displayDate();
		System.out.println(rbi.doLogin(888));
		System.out.println(rbi.withdraw(1000.00));

	}

}
