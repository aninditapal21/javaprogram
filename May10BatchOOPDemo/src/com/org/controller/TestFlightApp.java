package com.org.controller;
import java.util.Map;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.org.model.Flight;
import com.org.service.FlightService;
import com.org.serviceimpl.FlightServiceImpl;


public class TestFlightApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightServiceImpl service=new FlightServiceImpl();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter flight Id:");
			int fId=Integer.parseInt(sc.nextLine());
			System.out.println("Enter flight type");
			String fType=sc.nextLine();
			System.out.println("Enter flight source");
			String fSource=sc.nextLine();
			System.out.println("Enter flight destination");
			String fDest=sc.nextLine();
			System.out.println("Enter flight cost");
			double fPrice=Double.parseDouble(sc.nextLine());
			System.out.println("Enter flight date");
			String fDate=sc.nextLine();
			DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate flyingDate=LocalDate.parse(fDate, df);
			Flight flight=new Flight(fId,fType,flyingDate,fPrice,fSource,fDest);
			service.addFlight(flight);
		}
		Map<Integer, Flight> m1=service.viewAllFlight();
		for(Map.Entry<Integer,Flight> me:m1.entrySet())
			System.out.println(me.getKey()+"----->"+me.getValue().getFlightType()+" "+me.getValue().getFlightSource()+" "+me.getValue().getFlightDestination());
		
		System.out.println("Enter the flight id what you wants to remove");
		int flightId=Integer.parseInt(sc.nextLine());
		Flight fly=service.removeFlight(flightId);
		if(fly!=null) {
				System.out.println(fly);
		}
			//System.out.println(flight);
		else
			System.out.println("flight id is not matching");
		
		
		
	}

}
