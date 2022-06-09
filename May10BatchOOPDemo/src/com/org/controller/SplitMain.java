package com.org.controller;

public class SplitMain {

	public static String calcGST(String productsQR){
        String[]str1=productsQR.split("@");
        
        for(int i=0;i<str1.length;i++){
        	String []str2=str1[i].split(",");
        	System.out.println(str2[i]);
        }
       // for(String s:str2)
        //	System.out.println(s);
        return null;
        	
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="250,10@100,3@50,7";
		calcGST(str);
	}

}
