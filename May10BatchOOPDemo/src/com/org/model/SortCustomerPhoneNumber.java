package com.org.model;

import java.util.Comparator;

public class SortCustomerPhoneNumber implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if(o1.getCustomerPhone()>o2.getCustomerPhone())
			return 1;
		return -1;
	}

}
