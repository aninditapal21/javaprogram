package com.org.serviceimpl;

import com.org.service.BankingService;

class BankLoginService{
	public static BankingService getInstance() {
		BankingService service=(userName,password)->{
			if(userName.equalsIgnoreCase("admin")&& password==567)
				return true;
			return false;
		};
		return service;
	}
}
public class BankLoginServiceImpl {
	public static void main(String args[]) {
		BankingService service=BankLoginService.getInstance();
		if(service.adminLogin("admin",567))
			System.out.println("valid user");
		else
			System.out.println("invalid user");
		System.out.println(service.displayMsg());
		//BankingService service1= ()->{return "Good Afternoon";};
	}
}
