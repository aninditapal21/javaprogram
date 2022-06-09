package array;

import java.util.Scanner;
import java.util.Arrays;

class UserMainCode{
	public static int getBigDiff(int []a) {
		Arrays.sort(a);
		int diff=a[a.length-1]-a[0];
		return diff;
	}
	public static int addEvenOdd(int[] a) {
		int squarSum=0;
		int cubeSum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				squarSum+=a[i]*a[i];
			}
			else
				cubeSum+=a[i]*a[i]*a[i];
		}
		return squarSum+cubeSum;
	}
}

public class UserMainCodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int []array=new int[n];
		if(n<=0)
			System.out.println("array size  must be more than or equal to 1");
		else if (n==1) {
			for(int i=0;i<n;i++)
				array[i]=sc.nextInt();
			System.out.println(array[0]);
		}
		else
		{
			for(int i=0;i<n;i++)
				array[i]=sc.nextInt();
			int diffMaxMin=UserMainCode.getBigDiff(array);
			System.out.println("Difference bwtween Max Element and Min Element "+diffMaxMin);
			int add=UserMainCode.addEvenOdd(array);
			System.out.println("Add of Even and Odd "+add);
		}
		
				
		
	}

}
