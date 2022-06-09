package employee;

public class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount=0.0;
		if(employeeObj instanceof PermanentEmployee )
			loanAmount=(employeeObj.getSalary()*0.15);	
		if(employeeObj instanceof TemporaryEmployee )
			loanAmount=(employeeObj.getSalary()*0.10);
		return loanAmount;
	}
}
