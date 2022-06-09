package org.collection.pack;

import java.util.List;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of list");
		int n=Integer.parseInt(sc.nextLine());
		CitizenAddress cityAdd=new CitizenAddress();;
		for(int i=0;i<n;i++) {
			System.out.println("Enter name ");
			String name=sc.nextLine();
			System.out.println("Entre Location");
			String location=sc.nextLine();
			System.out.println("Enter Pincode");
			int pin=Integer.parseInt(sc.nextLine());
			Citizen city=new Citizen(name,location,pin);
			cityAdd.citizenList.add(city);
		}
		System.out.println("Printing the list Ascending in pin");
		Service service=new Service();
		service.showCitizensInAscendingByPin(cityAdd.citizenList).forEach(c->System.out.println(c.getName()+" "+c.getLocation()+" "+c.getPincode()));
		//for(Citizen c:l1)
			//System.out.println(c.getName()+" "+c.getLocation()+" "+c.getPincode());
		System.out.println("Printing the list Desceding in pin");
		service.showCitizensDescendingByPin(cityAdd.citizenList).forEach(c->System.out.println(c.getName()+" "+c.getLocation()+" "+c.getPincode()));
		
		System.out.println("Printing the list Ascending in Location");
		service.showCitizensInAscendingByLoc(cityAdd.citizenList).forEach(c->System.out.println(c.getName()+" "+c.getLocation()+" "+c.getPincode()));
		
		System.out.println("Printing the list Ascending in Location");
		service.showCitizensInDescendingByLoc(cityAdd.citizenList).forEach(c->System.out.println(c.getName()+" "+c.getLocation()+" "+c.getPincode()));
				
	}

}
