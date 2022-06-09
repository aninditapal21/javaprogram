package com.org.model;

import java.io.Serializable;

public class Employee implements Serializable{
	//can I declare
		//employee id shoule be number
		//Ravi Kumar +23456767
		//mar6767
		//phone
		private long id=1;
		private String name="admin";
		private double	sal=8823;
		private String email="abc@gamil.com";
		private long phone=3434;
		private String addres="asds";
		
		//constructor defination
		public Employee(long id, String name, float sal, String email, long phone, String addres) {
			super();
			this.id = id;
			this.name = name;
			this.sal = sal;
			this.email = email;
			this.phone = phone;
			this.addres = addres;
			
		}
		//how i will access to other class to set this properties
		//if this properties will access only by child class object then which access
		//specifier will use
		//public
		//to use public setter method
		//to use  public contructor
	public void setId(long id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setSal(double sal) {
			this.sal = sal;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public void setAddres(String addres) {
			this.addres = addres;
		}
		
		public long getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public double getSal() {
			return sal;
		}
		public String getEmail() {
			return email;
		}
		public long getPhone() {
			return phone;
		}
		public String getAddres() {
			return addres;
		}
		
}
