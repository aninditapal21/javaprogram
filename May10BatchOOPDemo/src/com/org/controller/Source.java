package com.org.controller;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Mobile{
    // Write your code here..
	HashMap<String,ArrayList<String>> mobiles=new HashMap<>();
	public String addMobile(String company, String model){
		ArrayList<String> modelList=new ArrayList();
		
		if(!mobiles.containsKey(company)){
			modelList.add(model);
			mobiles.put(company,modelList);
		}
		else{
			modelList = mobiles.get(company);
			modelList.add(model);
			mobiles.put(company,modelList);
		}
		return "model successfully added";
	}
	public ArrayList<String> getModels(String company){
		
		/*for(Map.Entry<String,ArrayList<String>> me:mobiles.entrySet()) {
			String companyKey=me.getKey();
			if(companyKey.equals(company))
				return me.getValue();
		}*/
		return mobiles.get(company);
	}
	/*public ArrayList<String> getModels(String company){
		ArrayList<String> lst = new ArrayList<String>();
		if(mobiles.containsKey(company)==false | mobiles.get(company)==null)
			return null;
		lst = mobiles.get(company);
		return(lst);
	}*/
	public String buyMobile(String company, String model)
	{
		ArrayList<String> lst = new ArrayList<String>();
		lst=mobiles.get(company);
		if(mobiles.containsKey(company)==true && lst.contains(model)==true){
			int i = lst.indexOf(model);
			lst.remove(i);
			mobiles.put(company,lst);
			return("mobile sold successfully");
		}
		else
			return("item not available");
		
			
	
	}
}

public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Mobile obj = new Mobile();
		obj.addMobile("Oppo", "K3");
		obj.getModels("Oppo");
		obj.buyMobile("Oppo", "K3");
	}
}