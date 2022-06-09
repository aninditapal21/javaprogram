package org.exception.pack;
import java.util.*;
public class ArrayException {
	
	public String getPriceDetails() {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements in the array ");
			int n=sc.nextInt();
			int []price=new int[n];
			System.out.println("Enter the price details");
			for(int i=0;i<price.length;i++) {
				price[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int index=sc.nextInt();
			sc.nextLine();
			System.out.println("The array element is "+price[index]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			return "Array index is out of range";
		}
		catch(InputMismatchException ie) {
			return "Input was not in the correct format";
		}
		return null;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayException a=new ArrayException();
		System.out.println(a.getPriceDetails());
	}
	

}
