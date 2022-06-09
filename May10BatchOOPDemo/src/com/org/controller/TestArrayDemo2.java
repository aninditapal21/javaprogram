package com.org.controller;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
//import java.util.Arrays;
/*
 * Object class
 * 1.root class of all user define and predefine classes
 * 
 * Method of Object Class
 * equal()
 * hashcode()
 * clone()
 * toString()
 * wait()
 * notify()
 * notifyAll()
 * 
 * interface Comparable{
	int compareTo(Object object);
}
 * 
 */

//model class
class Product implements Comparable{
	private int productId;
	private String productName;
	private double productOPrice;
	private int pQuantity;
	public Product(int productId, String productName, double productOPrice, int pQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productOPrice = productOPrice;
		this.pQuantity = pQuantity;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductOPrice() {
		return productOPrice;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productOPrice=" + productOPrice
				+ ", pQuantity=" + pQuantity + "]";
	}
	public int compareTo(Object object) {
		Product pArray=(Product)object;
		//sort by product Name
		//return this.productName.compareTo(pArray.productName);
		if(pArray.productId<this.productId)
			return 1;
		return -1;
	}
	
}
//business object class or service class
class ProductBO{
	 //multiple object of product we can store
	Product[]pArray;

	public Product[] getpArray() {
		return pArray;
	}

	public void setpArray(Product[] pArray) {
		this.pArray = pArray;
	} 
	public Product getProductById(int pId) {
		
		for(int i=0;i<pArray.length;i++) {
			if(pArray[i].getProductId()==pId) 
				return pArray[i];
		}
		return null;
	}
	public int getTotalPrice(Product[] p) {
		int sum=0;
		for(int i=0;i<p.length;i++) {
			sum+=p[i].getProductOPrice()*p[i].getpQuantity();
		}
		return sum;
	}
	public String[] getProducts()
	{
		String []pname=new String[pArray.length];
		for(int i=0;i<pArray.length;i++)
			pname[i]=pArray[i].getProductName();
		return pname;
		
		
	}
	//comparable
	public Product[] sortProduct()
	{
		
		Arrays.sort(pArray);
		return  pArray;
	}
}

public class TestArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductBO pbo=new ProductBO();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the product array");
		int size=sc.nextInt();
		Product[]productArray=new Product[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter Product Id");
			int pId=sc.nextInt();//1,2
			sc.nextLine();
			System.out.println("Enter Product Name");
			String pName=sc.nextLine();//A,B
			System.out.println("Enter product Price");
			double pPrice=sc.nextDouble();//34,45
			System.out.println("Enter product Quantity");
			int qty=sc.nextInt();//3,5
			Product product=new Product(pId,pName,pPrice,qty);//1 object of product(1,"A",34,3) 2 object of product(2,"B",45,5) 
			productArray[i]=product;
			
		}
			
		
		pbo.setpArray(productArray);
		Product[] pList=pbo.getpArray();
		/*
		 * for(int i=0;i<pList.length;i++)
		 * 		System.out.println(pList[i]);
		 * */
		for(Product p: pList) {
			System.out.println(p);//compiler is call ToString();
			//System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductOPrice()+" "+p.getpQuantity());
		}
		System.out.println("Enter the Product Id:");
		int pId=sc.nextInt();
		Product p=pbo.getProductById(pId);
		System.out.println(p);
		
		int TotalPrice=pbo.getTotalPrice(productArray);
		System.out.println("Total Price of All product is "+TotalPrice);
		
		System.out.println("Printing the name of Product");
		String [] name=pbo.getProducts();
		System.out.println(Arrays.toString(name));
		/*for(String s: name)
			System.out.println(s);*/
		System.out.println("sort the Array by product Id");
		Product []sortArray=pbo.sortProduct();
		for(Product s:sortArray)
			System.out.println(s);
		
		
	}

}
