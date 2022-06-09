package org.collection.pack;

public class Citizen{
	private String name;
	private String location;
	private int pincode;
	public Citizen(String name, String location, int pincode) {
		super();
		this.name = name;
		this.location = location;
		this.pincode = pincode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	//@Override
	/*public int compareTo(Citizen o) {
		// TODO Auto-generated method stub
		if(this.getPincode()<o.getPincode())
			return 1;
		return 0;
	}*/
	
}
