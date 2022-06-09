package com.org.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.org.model.Product;
import com.org.service.ProductService;
import com.org.serviceimpl.ProductServiceImpl;

public class TestProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ProductService service=new ProductServiceImpl();
		Product p;
		List<Product> list=new ArrayList();
		System.out.println("Enter the number of product");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Enter puoduct id:");
			int pId=Integer.parseInt(sc.nextLine());
			System.out.println("Enter product Name:");
			String pName=sc.nextLine();
			System.out.println("Enter product price:");
			double pPrice=Double.parseDouble(sc.nextLine());
			p=new Product(pId,pName,pPrice);
			service.addProduct(p);
		}
		System.out.println("Details of products:");
		service.getAllProduct().forEach(m->System.out.println(m.getProductId()+" "+m.getpName()+" "+m.getpPrice()));
		Product maxProduct=service.getMaxProductPrice();
		//for(Product pe:maxProduct)
			System.out.println(maxProduct.getProductId()+" "+maxProduct.getpName()+" "+maxProduct.getpPrice());
		
		System.out.println("Product bext price:");
		service.serachProductsBasedPrice().forEach(m->System.out.println(m.getProductId()+" "+m.getpName()+" "+m.getpPrice()));
		
		System.out.println("Product from low to high price:");
		service.sortProductFromLowPricetoHighPrice().forEach(m->System.out.println(m.getProductId()+" "+m.getpName()+" "+m.getpPrice()));
		
		double totalPrice=service.getTotalPrice();
		System.out.println("Total Price is:"+totalPrice);
		
		
		System.out.println("Enter product id that u want to remove");
		int removePid=Integer.parseInt(sc.nextLine());
		Product removePr=service.removeProduct(removePid);
		System.out.println(removePr.getProductId()+" "+removePr.getpName()+" "+removePr.getpPrice());
		
	}

}
