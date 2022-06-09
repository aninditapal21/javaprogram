package org.map.pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeePayrollMain {

	public static Map<Integer,Integer>increaseSalaries(Map<Integer,String> list1,Map<Integer,Integer> list2){
		Set<Integer>setOfMap1=list1.keySet();
		Iterator<Integer> itr=setOfMap1.iterator();
		Map<Integer,Integer>newlist=new HashMap();
		while(itr.hasNext()) {
			int key=itr.next();
			String value=list1.get(key);
			
			if(value.equalsIgnoreCase("manager")) {
				int salary=list2.get(key)+5000;
				newlist.put(key, salary);
			}
		}
		return newlist;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<Integer,String> list1=new HashMap();
		Map<Integer,Integer> list2=new HashMap();
		System.out.println("Enter the number of Employee");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			Employee e;
			System.out.println("Enter employee id");
			int empId=Integer.parseInt(sc.nextLine());
			System.out.println("Enter employee designation");
			String deg=sc.nextLine();
			System.out.println("Enter employee salary");
			int salary=Integer.parseInt(sc.nextLine());
			e=new Employee(empId,deg,salary);
			list1.put(empId, deg);
			list2.put(empId,salary);
		}	
		Map<Integer,Integer>newlist=increaseSalaries(list1,list2);
		for(Map.Entry<Integer,Integer> m:newlist.entrySet())
			System.out.println(m.getKey()+"\n"+m.getValue());
		
	}

}
