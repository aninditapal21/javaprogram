package com.org.controller;
import java.util.*;
//i have store marks of 10 students
//i have to calculate persentage
//i have to dispaly all marks
//if marks will less than 35 and <30 then i have to add grace amrks
//i have to count number passed or number of filled students
//{10,47,38,89,90,2,3,56}--integer elements
//Array is a container object which can contain/store more than one element with fixed size 

class StudentBO{
	public static int[]setGraceMarks(int[] number){
		//int []modifiedMarks=new int[number.length];
		for(int i=0;i<number.length;i++) {
			if(number[i]<35 && number[i]>=30)
				number[i]=number[i]+5;
		}
		return number;
			
	}
	//public static int [] getArray() {}
	public static int getTotalMarks(int[] marks) {
		int totalMarks=0;
		for(int i=0;i<marks.length;i++)
			totalMarks=totalMarks+marks[i];
		return totalMarks;
	}
	public static int[] sortMarks(int[] marks) {
		int temp=0;
		for(int i=0; i <marks.length; i++){
			
            for(int j=1; j < (marks.length-i); j++){
                     if(marks[j-1] > marks[j]){
                           
                             temp = marks[j-1];
                            marks[j-1] = marks[j];
                            marks[j] = temp;
                    }
                    
            }
    }
		return marks;
	}
	public static int[] calculatePer(int[] number){
		int []persentage=new int[number.length];
		for(int i=0;i<number.length;i++) {
			persentage[i]=(number[i]*100)/70;
		}
		return persentage;
		
	}
	//you will implement
	public static String sayPassOrFail(int[] marks) {
		int pcount=0;
		int fcount=0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>=30)
				pcount++;
			else
				fcount++;
		}
		return pcount+" pass "+fcount+" fail";
	}
	public static int[] copyMarksArray(int[] marks,int from,int to) {
		//int []copiedResult=Arrays.copyOf(marks, 5);
		int [] copiedResult=Arrays.copyOfRange(marks, from, to);
		return copiedResult;
	}
}

public class TestArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[0][0][0][0][0][0][0][0][0][0]
		
		Scanner sc=new Scanner(System.in);
		int []marks=new int[5];
		System.out.println("Enter the marks of 5 students");
		for(int i=0;i<marks.length;i++)
			marks[i]=sc.nextInt();
		
		System.out.println("Printing after adding grace marks......");
		int[] result=StudentBO.setGraceMarks(marks);
		int totalResult=StudentBO.getTotalMarks(marks);
		for(Integer i:result)
			System.out.println(i);
		System.out.println("Total marks of 5 students:");
		System.out.println(totalResult);
		System.out.println("Persentage of each students:");
		int [] persentageArray=StudentBO.calculatePer(result);
		for(Integer i:persentageArray)
			System.out.println(i);
		System.out.println("Printing After sorting");
		int []sortArray=StudentBO.sortMarks(marks);
		for(Integer i: sortArray)
			System.out.println(i);
		System.out.println("How many are Pass and fail:");
		System.out.println(StudentBO.sayPassOrFail(marks));
		
		//System.out.println(Arrays.toString(StudentBO.copyMarksArray(marks)));
		System.out.println(Arrays.toString(StudentBO.copyMarksArray(marks,1,4)));
		

	}

}
