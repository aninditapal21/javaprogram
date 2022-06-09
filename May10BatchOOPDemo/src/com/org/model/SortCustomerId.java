package com.org.model;
import java.util.Comparator;
public class SortCustomerId implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Customer c1=(Customer)o1;
		Customer c2=(Customer)o2;
		if(c1.getCustomerId()>c2.getCustomerId())
			return 1;
		return -1;
	}
	
}
