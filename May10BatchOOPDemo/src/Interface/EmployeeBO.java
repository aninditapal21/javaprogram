package Interface;

public class EmployeeBO implements EmployeeService{
	Employee emp;
	@Override
	public void addEmployee(Employee emp) {
		this.emp=emp;
		//return emp;
	}
	@Override
	public Employee displayEmployee(Employee emp) {
		return emp;
	}
}
