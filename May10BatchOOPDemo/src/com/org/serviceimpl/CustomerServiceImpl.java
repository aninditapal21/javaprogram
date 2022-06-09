package com.org.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.org.exception.InvalidException;
import com.org.model.Customer;
import com.org.model.SortCustomerId;
import com.org.model.SortCustomerPhoneNumber;
import com.org.service.CustomerService;

public class CustomerServiceImpl implements CustomerService
{

	List<Customer> listOfCustomer=new LinkedList<Customer>();
	@Override
	//add customer object into one list
	public boolean addCustomer(Customer customer) {
            
  if(listOfCustomer.add(customer))
  {
	  return true;
  }
		return false;
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		
		return listOfCustomer;
	}

	@Override
	public Customer removeCustomerById(int customerId) {
		//LinkedList<Customer>finalList=new LinkedList<Customer>(listOfCustomer);
		// TODO Auto-generated method stub
		for(int i=0;i<listOfCustomer.size();i++) {
			if(listOfCustomer.get(i).getCustomerId()==customerId) {
				
				//remove(int i)-----Object
				//remove(Object obj)------return type is boolean
				return listOfCustomer.remove(i);
			}
		}
		return null;
	}

	@Override
	public List<Customer> updateCustomerPhone(int customerId, long phone) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<listOfCustomer.size();i++) {
			if(listOfCustomer.get(i).getCustomerId()==customerId) 
				listOfCustomer.get(i).setCustomerPhone(phone);
			}
		
		return listOfCustomer;
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		// TODO Auto-generated method stub
		for(int i=0;i<listOfCustomer.size();i++) {
			if(listOfCustomer.get(i).getCustomerId()==customerId)
				return listOfCustomer.get(i);
		}
		return null;
	}

	//implement by comparable
	@Override
	public List<Customer> sortByDateOfBirth() {
		// TODO Auto-generated method stub
		
		//Arrays.sort(arrayObject)
		//sort(List type)----which will be implemented comparable interface
		//sort(list,new Compareable())
		
		
		/*Integer implements Comparable interface------compareTo(Object obj)
		 * String implements Comparable interface------compareTo(Object obj)
		 * Float implements Comparable interface------compareTo(Object obj)
		 * Double implements Comparable interface------compareTo(Object obj)
		 * */
		
		
		Collections.sort(listOfCustomer);
		return listOfCustomer;
		
		
		//return null;
	}
	//implement by comparator
	@Override
	public List<Customer> sortById() {
		// TODO Auto-generated method stub
		Comparator<Customer> cmp=new SortCustomerId();
		//sort(list<customer>,object of comaparator
		//Collections.sort(listOfCustomer,new SortCustomerId());
		Collections.sort(listOfCustomer,cmp);
		
		return listOfCustomer;
	}

	@Override
	public List<Customer> sortByPhoneNumber() {
		// TODO Auto-generated method stub
		Comparator<Customer> cmp2=new SortCustomerPhoneNumber();
		Collections.sort(listOfCustomer,cmp2);
		return listOfCustomer;
	}

	@Override
	public List<Customer> updateCustomerInfo(int customerId, Customer customer) throws  InvalidException{
		// TODO Auto-generated method stub
		for(int i=0;i<listOfCustomer.size();i++) {
			if(listOfCustomer.get(i).getCustomerId()==customerId) {
				listOfCustomer.get(i).setEmailId(customer.getEmailId());
				listOfCustomer.get(i).setCustomerPhone(customer.getCustomerPhone());
			}
			/*else 
				throw new InvalidException("Candidate is invalid");*/
		}
		
		return null;
	}
	
	
}