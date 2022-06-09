package com.org.model;

public class Product {
	private int productId;
	private String pName;
	private double pPrice;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
	public Product(int productId, String pName, double pPrice) {
		super();
		this.productId = productId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
