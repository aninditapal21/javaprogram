package com.org.controller;
/*
 *          ENG,......MATH....COM   TotalMarks.
 *student1   90       67      08      90+67+08=165
 * student2  56       45      54      56+45+54=155
 * student3  100      87      32      100+87+32=219
 *
 * {{90,56.100,90,100},{67,45,87,82,90},{08,54,32,56,12},{},{}......}
 */

import java.util.Arrays;
import java.util.Scanner;
class  StudentService
{
	/*
	 * E
	 * 
	 * 
	 * 
	 */
	public void printMarks(int[][] marksList)
	{
		for(int row=0;row<marksList.length;row++) {
			for(int col=0;col<marksList[row].length;col++) {
				System.out.print(marksList[row][col]+" ");
			}
			System.out.println();
		}

		
	}
	public void getTotalMarks(int[][] marksList)
	{
		
		for(int row=0;row<marksList.length;row++) {
			int sum=0;
			for(int col=0;col<marksList[row].length;col++) {
				sum+=marksList[row][col];
			}
			System.out.println("Total marks of student"+(row+1)+" is: "+sum);
		}
	}
	public int findlargestRows(int[][] marksList)
	{
		int[]array=new int[marksList.length];
		for(int row=0;row<marksList.length;row++) {
			int sum=0;
			for(int col=0;col<marksList[row].length;col++) {
				sum+=marksList[row][col];
				array[row]=sum;
			}
		}
		Arrays.sort(array);
		return array[array.length-1];
	}
	public static int countMale(String[] names)
    
    {
		int maleCount=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith("Mr."))
				maleCount++;
		}
		return maleCount;
		//startwith()....boolean
		//this method will iterate names from this string array
		//if the name prefix starts with Mr. then counter will increment by one
		//return that counter
		//N.B stores name is this string array like Mr. Ankit Kumar, Mrs. Amita


    }
	
}


public class TestTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of student");
		int m=sc.nextInt();
		System.out.println("Enter the number of subjects:");
		int n=sc.nextInt();
		int[][]marksList=new int[m][n];
		//int[][] marksList= {{89,34,56},{34,67,90},{23,56,78}};
		int element=n*m;
		System.out.println("Enter "+element+" elements into array");
		
		for(int row=0;row<marksList.length;row++) {
			for(int col=0;col<marksList[row].length;col++) {
				marksList[row][col]=sc.nextInt();
			}
			System.out.println();
		}
		StudentService student=new StudentService();
		student.printMarks(marksList);
		student.getTotalMarks(marksList);
		int largestElement=student.findlargestRows(marksList);
		System.out.println("Highest marks is: "+largestElement);
		
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		sc.nextLine();
		String []name=new String[size];
		System.out.println("Enter the name");
		for(int i=0;i<name.length;i++)
			name[i]=sc.nextLine();
		System.out.println("Number of male in an List is: "+StudentService.countMale(name));
		
	}

}
