package org.exception.pack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BookingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Passenger Name");
		String name=sc.nextLine();
		System.out.println("Enter Travel Date");
		String tdate=sc.nextLine();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate travelDate=LocalDate.parse(tdate,df);
		System.out.println("Enter number of tickets");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter each Amount of ticket");
		double price=Double.parseDouble(sc.nextLine());
		
		TicketBooking t=new TicketBooking(name,travelDate,n,price);
		BookingImpl b=new BookingImpl();
		double totalPrice=b.computerBillAmount(t);
		System.out.println(totalPrice);
	}

}
