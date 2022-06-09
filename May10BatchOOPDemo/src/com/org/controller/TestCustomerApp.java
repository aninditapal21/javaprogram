package com.org.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.org.exception.InvalidException;
import com.org.model.Customer;
import com.org.service.CustomerService;
import com.org.serviceimpl.CustomerServiceImpl;

public class TestCustomerApp {

	public static void main(String[] args) {

  CustomerService service=new CustomerServiceImpl();
	Scanner scanner=new Scanner(System.in);	
  System.out.println("Enter the size of data base");
  int size=Integer.parseInt(scanner.nextLine());//3
  for(int i=0; i<size; i++)
  {
	  
	  System.out.println("Enter customer id");
	  int id=Integer.parseInt(scanner.nextLine());
	  
	  System.out.println("Enter customer name");
	  String custName=scanner.nextLine();
	  
	  System.out.println("Enter customer phone");
	  long ph=Long.parseLong(scanner.nextLine());
	  System.out.println("Enter customer address");
	  String address=scanner.nextLine();
	  System.out.println("Enter customer email");
	  String email=scanner.nextLine();
	  //-MM-yyyy
	  System.out.println("Enter customer dob in dd/MM/yyyy format");
	  String dob=scanner.nextLine();
	  System.out.println("Enter customer gender");
	  String gen=scanner.nextLine();
	  Customer customer=new Customer();// firstObj{1,A--- 
	  customer.setCustomerId(id);
	  customer.setCustomerName(custName);
	  customer.setCustomerPhone(ph);
	  customer.setEmailId(email);
	  customer.setAddress(address);
	  DateTimeFormatter foramt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	   LocalDate date1=LocalDate.parse(dob,foramt);
	  
	  
	  customer.setDob(date1);
	  customer.setGender(gen);
	  
	 if(  service.addCustomer(customer))
	 {
		 System.out.println("Customer object inserted into list");
	 }
  }
	 List<Customer> viewCustomer=service.getCustomer();
	 System.out.println("Printing customer Details:");
	 for(Customer c:viewCustomer)
		 System.out.println(c);
	 
	 System.out.println("Enter the customer id that you want to remove");
	 int CustomerId=Integer.parseInt(scanner.nextLine());
	 Customer cus=service.removeCustomerById(CustomerId);
	 
	 if(cus!=null)
		 System.out.println(cus);
	 //for(Customer c: cus)
		 //System.out.println(c);
	 else
		 System.out.println("customer id is not matching");
	 
	  System.out.println("After sorting base on Date Of Birth...........");
	  List<Customer>listOfCustomer=service.sortByDateOfBirth();
	  for(Customer c:listOfCustomer)
		  System.out.println(c.getCustomerId() + " "+c.getCustomerName() + " "+c.getDob());
	  
	  
	  
	  System.out.println("After sorting base on id.......");
	  List<Customer> listOfCustomer1=service.sortById(); 
	  for(Customer c:listOfCustomer1)
		  System.out.println(c.getCustomerId() + " "+c.getCustomerName() + " "+c.getDob());
	  
	  System.out.println("After sorting base on Phone number.......");
	  List<Customer> listOfCustomer2=service.sortByPhoneNumber(); 
	  for(Customer c:listOfCustomer2)
		  System.out.println(c.getCustomerId() + " "+c.getCustomerName() + " "+c.getDob()+" "+c.getCustomerPhone());
	  
	  
	  System.out.println("Enter customer id u want to search......");
	  int CusId=Integer.parseInt(scanner.nextLine());
		 Customer cus1=service.searchCustomerById(CusId);
		 
	  if(cus1!=null)
		 System.out.println(cus1);
	  else
		 System.out.println("customer id is not matching");
	 
	  System.out.println("Enter customer id whose phone number u want to change");
	  int cusId1=Integer.parseInt(scanner.nextLine());
	  System.out.println("Enter new Phone Number");
	  long newPhn=Long.parseLong(scanner.nextLine());
	  List<Customer> list1=service.updateCustomerPhone(cusId1, newPhn);
	  for(Customer c:list1)
		  System.out.println(c);
	  
	  
	  
	  System.out.println("Enter costomer id that you want to update");
	  int cusId2=Integer.parseInt(scanner.nextLine());
	  Customer c1=service.searchCustomerById(cusId2);
	  Customer updateCustomerObj=new Customer();
	  try {
		  if(c1!=null) {
		  System.out.println("Enter new email id");
		  String newEmail=scanner.nextLine();
		  updateCustomerObj.setEmailId(newEmail);
		  System.out.println("Enter new Phone Number");
		  long newPhno=Long.parseLong(scanner.nextLine());
		  updateCustomerObj.setCustomerPhone(newPhno);
		  List<Customer> updateCutomer=service.updateCustomerInfo(cusId2, updateCustomerObj);
		  for(Customer c: updateCutomer)
			  System.out.println(c);
		  }
		  else {
			  throw new InvalidException("Candidate is invalid");
		  }
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
		
		

	}

}
