package employee;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee emp1;
		Employee emp2;
		System.out.println("Enter empId");
		int empId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter empName");
		String empName=sc.nextLine();
		System.out.println("BAsicPay");
		double basicPay=sc.nextDouble();
		System.out.println("Enter hourWorked");
		int hoursWorked=sc.nextInt();
		System.out.println("enter hourlyWages");
		int hourlyWages=sc.nextInt();
		emp1=new PermanentEmployee(empId,empName,basicPay);
		emp2=new TemporaryEmployee(empId,empName,hoursWorked,hourlyWages);
		emp1.calculateSalary();
		emp2.calculateSalary();
		Loan l=new Loan();
	    System.out.println(l.calculateLoanAmount(emp2));
	    System.out.println(l.calculateLoanAmount(emp1));
	} 

}
