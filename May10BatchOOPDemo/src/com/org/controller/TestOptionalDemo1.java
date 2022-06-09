package com.org.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Customer
{
	private int customerId;
	private String customerName;
	private String customerEmail;
	public Customer(int customerId, String customerName, String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	
}
public class TestOptionalDemo1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> listOfCustomer=new ArrayList();
		listOfCustomer.add(new Customer(1,"ABC","abc@gmail.com"));
		listOfCustomer.add(new Customer(2,"XYZ","xyz@gmail.com"));
		listOfCustomer.add(null);
		listOfCustomer.add(new Customer(3,"ddwd","xssd@gmail.com"));
		/*Integer i1=null;
		Integer i2=100;
		Optional<Integer> optionaalObj=Optional.empty();

				System.out.println(optionaalObj);
				//If you ofNullable
				Optional<Integer> op2=Optional.ofNullable(i2);
				System.out.println(op2);
				Optional<Integer> op3=Optional.of(i2);
				System.out.println(op3);*/
		Optional<Customer> op1;
		for(Customer cust:listOfCustomer)
		{
			op1=Optional.ofNullable(cust);
			System.out.println(op1.isPresent());
			//System.out.println(op1);
			Customer c=	op1.orElse(new Customer(123,"abcd","abcd@gmail.com"));
			System.out.println(c.getCustomerId() +" "+c.getCustomerName() +" "+c.getCustomerEmail());
		}
			
	}

}
