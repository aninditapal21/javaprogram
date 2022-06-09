package org.exception.pack;

import java.io.IOException;
import java.sql.SQLException;

//i want to create my own exception class or user define exception class
class InvalidAmountError extends Exception{
	
	public InvalidAmountError(String errorMsg) {
		super(errorMsg);
	}
}

class BankBO{
	double availableAmount=65000.00;
	//if any one will give invalid amount then this method can capable to handle exception
	//access_specifier non-access-specified return type name(param1,param2---n)throws
	//throws type of exception
	double withdraw(double amount)throws InvalidAmountError,IOException,SQLException {
		
		
		if(amount>availableAmount) {
			//exclicitly i am throwing me exception as per my condition
			//throw throw object of exception
			throw new InvalidAmountError("Give amount ,less than"+" "+availableAmount);	
		}
		return availableAmount-amount;
	}
}
public class TextExceptionDemo4 {

	
	public static void callMethod() {
		BankBO bank=new BankBO();
		try {
			System.out.println(bank.withdraw(7000.00));
		}
		catch(InvalidAmountError|IOException|SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) //throws InvalidAmountError, IOException, SQLException 
	{
		// TODO Auto-generated method stub
		
		
		//either i can surrounded the entire statement within try-catch block
		//we can 
		callMethod();
	}

}
