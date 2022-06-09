package org.collection.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainHightestScore {
    public static String highestScorer (List<String> infolist) {
    	int max=0;
    	String name1="";
    	for(int i=0;i<infolist.size();i++) {
    		
    		//int []marks=new int[infolist.size()];
    		String score=infolist.get(i);
    		String[]scoreDetails=score.split("-");
    		String name=scoreDetails[0];
    		int marks1=Integer.parseInt(scoreDetails[1]);
    		int marks2=Integer.parseInt(scoreDetails[2]);
    		int marks3=Integer.parseInt(scoreDetails[3]);
    		int totalMarks=marks1+marks2+marks3;
    		if(totalMarks>max) {
    			max=totalMarks;
    			name1=name;
    		}
    	}    	
    	
    	
    	return name1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<String> studentInfo=new ArrayList();
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student information");
		for(int i=0;i<n;i++) {
			String info=sc.nextLine();
			studentInfo.add(info);
		}
		System.out.println(highestScorer(studentInfo));
			
		
	}

}
