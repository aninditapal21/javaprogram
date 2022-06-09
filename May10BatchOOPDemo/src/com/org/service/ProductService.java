package com.org.service;
import com.org.model.Product;
import java.util.stream.*;
import java.util.List;
public interface ProductService {
	public void addProduct(Product product);
	Stream<Product> getAllProduct();
	//This method will search product whose price is more than 5000.00
	 List<Product> serachProductsBasedPrice();
	double  getTotalPrice();
	List<Product> sortProductFromLowPricetoHighPrice();
	Product getMaxProductPrice();
	Product removeProduct(int pId);
	List<Product> updateProduct(int productId);
}
