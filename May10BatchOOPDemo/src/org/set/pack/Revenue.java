package org.set.pack;

import com.org.model.Customer;

public class Revenue implements Comparable<Revenue>{
	private String revenueCategory;
	private int amount;
	public Revenue(String revenueCategory, int amount) {
		super();
		this.revenueCategory = revenueCategory;
		this.amount = amount;
	}
	public String getRevenueCategory() {
		return revenueCategory;
	}
	public void setRevenueCategory(String revenueCategory) {
		this.revenueCategory = revenueCategory;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/*public int compareTo(Revenue o1,Revenue o2) {
		if(o1.getAmount()>o2.getAmount())
			return 1;
		return -1;
	}*/
	@Override
	public int compareTo(Revenue o1) {
		// TODO Auto-generated method stub
		if(this.getAmount()<o1.getAmount())
			return 1;
		return -1;
	}
	
}
