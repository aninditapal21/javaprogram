package salary;
import java.util.*;
public class EmployeeMain {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee e=getEmployeeDetails();
		e.calculateNetSalary(getPFPercentage());
		System.out.println("Id:"+e.getEmployeeId());
		System.out.println("Name:"+e.getEmployeeName());
		System.out.println("Salary:"+e.getSalary());
		System.out.println("Net Salary:"+e.getNetSalary());
		
		
	}
	public static Employee getEmployeeDetails() {
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id:");
		int eid=sc.nextInt();
		sc.nextLine();
		e.setEmployeeId(eid);
		System.out.println("Enter Name");
		String eName=sc.nextLine();
		e.setEmployeeName(eName);
		System.out.println("Enter Salary");
		double eSalary=sc.nextDouble();
		e.setSalary(eSalary);
		return e;
	}
	public static int getPFPercentage() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PF percentage:");
		int pf=sc.nextInt();
		return pf;
	}
	
	

}
