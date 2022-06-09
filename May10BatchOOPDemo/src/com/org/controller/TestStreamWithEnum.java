   package com.org.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import java.util.*;
import org.map.pack.Employee;

//veg non veg
//UserStatus
//online offline
//enumuration

enum SortMethod
{
	//0, 1
	BYNAME,BYPRICE;
}
class Product1
{
	private int pId;
	private String pName;
	private double pPrice;
	public Product1(int pId, String pName, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public Product1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
	
	
}
/*
 * 
 * valid type-primitive type,class, interface, collection, map, enum type
 * 
 * 
 */
class ProductBO1
{
	
	public  static Stream<Product1> getSortedProduct(List<Product1> listOfProducts, SortMethod sort)
	{
		//
		
		//System.out.println(sort);
		//SortMethod[] a=SortMethod.values();
		//for(int i=0; i<a.length ; i++)
		//{
			//String s2=a[i].name();
			//System.out.println(s2);
		//}
		//String name()
		String sortMethods=	sort.name();
		System.out.println(sortMethods);
	
		//System.out.println(sort.ordinal());
	if(sortMethods.equals("BYNAME"))
	{
		Comparator<Product1> sortProductByName=(p1,p2)-> p1.getpName().compareTo(p2.getpName())>1 ? 1:-1;
		return listOfProducts.stream().sorted(sortProductByName);
	}else if(sortMethods.equals("BYPRICE"))
	{
		Comparator<Product1> sortProductByPrice=(p1,p2)-> p1.getpPrice()< p2.getpPrice() ? 1:-1;
		return listOfProducts.stream().sorted(sortProductByPrice);
	}
		
		
		return null;
	}
	/*public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
		entities.stream().filter(p->p.getpName().startWith("[@!$#&*%]{1}[a-zA-Z]+]")).
	}*/
	
}



public class TestStreamWithEnum {

	public static void main(String[] args) {
  List<Product1> products=new ArrayList<Product1>();
products.add(new Product1(1, "ABC", 457.00));
products.add(new Product1(2, "XYZ", 657.00));
products.add(new Product1(5, "TBC", 957.00));
products.add(new Product1(8, "GBC", 57.00));
products.add(new Product1(9, "Ay", 857.00));

  Stream<Product1> s1=   ProductBO1.getSortedProduct(products, SortMethod.BYPRICE);
  s1.forEach(p->System.out.println(p.getpId() + " "+p.getpName() + " "+p.getpPrice()));

	}
}
