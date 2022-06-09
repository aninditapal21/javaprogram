package account;
import java.util.*;
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer id");
		int cid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter customer Name ");
		String cName=sc.nextLine();
		System.out.println("Enter email.id");
		String cEmail=sc.nextLine();
		Customer cobj=new Customer(cid,cName,cEmail);
		System.out.println("Account Number");
		int acno=sc.nextInt();
		System.out.println("Balance");
		double balance=sc.nextDouble();
		System.out.println("Minimum balance");
		double minbalance=sc.nextDouble();
		System.out.println("Amount");
		double amount=sc.nextDouble();
		
		SavingsAccount sobj=new SavingsAccount(acno,cobj,balance,minbalance);
		if(sobj.withdraw(amount)==true)
			System.out.println("Withdraw is successfull,Now balance is "+sobj.getBalance());
		else
			System.out.println("failed");
		
		
	}

}
