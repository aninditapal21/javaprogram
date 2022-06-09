
package Interface;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(123,"Anindita",21000.0);
		EmployeeService service=new EmployeeBO();
		//e=new EmployeeBO();
		service.addEmployee(emp);
		Employee e1=service.displayEmployee(emp);
		System.out.println(e1.empId+" "+e1.empName+" "+e1.salary);
		
		
	}

}
