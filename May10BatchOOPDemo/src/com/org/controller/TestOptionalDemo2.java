package com.org.controller;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
class MyClass1{
	
	public static Optional<Integer> getOptionalForList(List<Integer> list){
		Optional<Integer>op=null;
		for(int i=0;i<list.size();i++) {
			op=Optional.ofNullable(list.get(i));
			System.out.println(op.isPresent());
			int k=op.orElse(1000);
			System.out.println(k);
		}
		return op;
	}
	public static int multiply(Optional<Integer> num1,Optional<Integer> num2) {
		if(num1.isPresent()) {
			if(num2.isPresent()) {
				int x=num1.get();
				int y=num2.get();
				return x*y;
			}
			else {
				int x=num1.get();
				int y=num2.orElse(200);
				return x*y;
			}
		}
		else {
			int x=num1.orElse(200);
			int y=num2.get();
			return x*y;
		}
			
			
		//return 0;
	}
}

public class TestOptionalDemo2 {
	static Integer i1,i2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Optional<Integer> op=MyClass1.getOptionalForList(Arrays.asList(new Integer[] {10,null,78,90,null}));
		System.out.println("Enter the first value");
		Integer i1=Integer.parseInt(sc.nextLine());
		//Integer i1=20;
		System.out.println("Enter the 2nd value");
		Integer i2=Integer.parseInt(sc.nextLine());
		//Integer i2=null;
		Optional<Integer>o1=Optional.ofNullable(i1);
		Optional<Integer>o2=Optional.ofNullable(i2);
		int result=MyClass1.multiply(o1, o2);
		System.out.println(result);
		
	}

}
