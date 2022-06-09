package com.org.model;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{
  private int customerId;
  private String customerName;
  private long customerPhone;
  private String address;
  private String emailId;
  private LocalDate dob;
  private String gender;
public Customer(int customerId, String customerName, long customerPhone, String address, String emailId, LocalDate dob,
		String gender) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerPhone = customerPhone;
	this.address = address;
	this.emailId = emailId;
	this.dob = dob;
	this.gender = gender;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getCustomerPhone() {
	return customerPhone;
}
public void setCustomerPhone(long customerPhone) {
	this.customerPhone = customerPhone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhone=" + customerPhone
			+ ", address=" + address + ", emailId=" + emailId + ", dob=" + dob + ", gender=" + gender + "]";
}
  public int compareTo(Customer customerObj) {
	  if(customerObj.dob.isBefore(this.dob))
			  return 1;
	  
	  return -1;
  }
  
  
  
	
	
	
}
