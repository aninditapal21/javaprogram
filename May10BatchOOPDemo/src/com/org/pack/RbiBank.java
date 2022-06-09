package com.org.pack;
/*
 * one component Should consist all the pincode value of customer
 * anouther component should consist amethod which returntrue if the given pin id will match with datasource on
 * finally these component should be implementd by one abstract class called RbiBank
 * 
 * 1.interface is collection of global constants method
 * 2.public static and final
 * 3.by default all the method are public and abstract
 * */

interface DataSource1{
	//all pin codes
	int []pinCode= {123,567,890,7878};
}
interface LoginService{
	//datasource--database server,cloud server,
	//providing Login service
	//jdk 1.8 interface one default
	//void show()
	default boolean doLogin(int pin) {
		for(int i=0;i<DataSource1.pinCode.length;i++) {
			if(DataSource1.pinCode[i]==pin)
				return true;
		}
		return false;
	}
}
//different server
interface A{
	void displayDate();
}
//interface can be implemented by classes
public abstract class RbiBank implements DataSource1,LoginService,A{
	private double amount=20000.00;
	
	
	public RbiBank(String msg) {
		System.out.println(msg);
	}
	//method must have return type
	//primitive type,string array,class type,interface type,list,set,map,object[],T,void
	//if you are the customer then you can use by giveing user id and password
	public double withdraw(double amount) {
		this.amount=this.amount-amount;
		return this.amount;
	}
	//sbi,icici,hdfc,pnb
	//Thus method should be declear and should be overridden by all the sub class rbi
	//method should be abstract or un implemented
	abstract boolean getBanking(RbiBank rbi);
}
