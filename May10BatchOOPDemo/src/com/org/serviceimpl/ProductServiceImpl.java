package com.org.serviceimpl;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.org.model.Product;
import com.org.service.ProductService;
import java.util.ArrayList;
import java.util.Comparator;
public class ProductServiceImpl implements ProductService {

	List<Product>listOfProduct=new ArrayList();
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		listOfProduct.add(product);
	}

	@Override
	public Stream<Product> getAllProduct() {
		Stream<Product> streamOfProduct=listOfProduct.stream();
		return streamOfProduct;
	}

	@Override
	public List<Product> serachProductsBasedPrice() {
		// TODO Auto-generated method stub
		return listOfProduct.stream().filter(p->p.getpPrice()>=5000.00).collect(Collectors.toList());
	}

	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		
		return  listOfProduct.stream().map(p->p.getpPrice()).reduce(0.0,(sum, product) ->sum+ product);
	}

	@Override
	public List<Product> sortProductFromLowPricetoHighPrice() {
		// TODO Auto-generated method stub
		Comparator<Product> productComparator=(product1,product2)->product1.getpPrice()>product2.getpPrice()?1:-1;
		List<Product> list=listOfProduct.stream().sorted(productComparator).collect(Collectors.toList());
		return list;
	}

	@Override
	public Product getMaxProductPrice() {
		// TODO Auto-generated method stub
			Comparator<Product> productComparator=(product1,product2)->product1.getpPrice()>product2.getpPrice()?1:-1;
			return listOfProduct.stream().max(productComparator).get();
	}

	@Override
	public Product removeProduct(int pId) {
		// TODO Auto-generated method stub
		for(int i=0;i<listOfProduct.size();i++) {
			if(listOfProduct.removeIf(p->p.getProductId()==pId))
				return listOfProduct.get(i);
			
		}
		return null;
	}

	@Override
	public List<Product> updateProduct(int productId) {
		// TODO Auto-generated method stub
		
		
		return  listOfProduct.stream().filter(p->p.getProductId()==productId).peek(p->p.setpPrice(7788.00)).collect(Collectors.toList());
	}

}
