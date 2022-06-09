package com.org.controller;
import java.util.List;
import java.io.*;
import java.sql.SQLException;
import java.util.Scanner;

import com.org.model.Employee;
import com.org.service.EmployeeService;
import com.org.serviceimpl.EmployeeDao;




public class TestJdbcEmpApp {
	
	static OutputStream output;
	static EmployeeService service=new EmployeeDao();
	public static void seFile(OutputStream output1) {
		output=output1;
	}
	public static void serializeEmployee() throws IOException
	{
		List<Employee>list=service.viewAllEmployee();
		ObjectOutputStream objOut=new ObjectOutputStream(output);
		for(Employee e:list) {
			objOut.writeObject(e);
		}
		System.out.println("Customer object serialized");
	}
	public static void deSerialize(String filePath) throws FileNotFoundException, IOException,ClassNotFoundException{
		FileInputStream fin=new FileInputStream(filePath);
		ObjectInputStream input=new ObjectInputStream(fin);
		int k=0;
		System.out.println(fin.available());
		Employee e1=null;
		 while((k=fin.available())!=0)
		 {
			 
			 e1=(Employee)input.readObject();
			System.out.println(e1.getId()+ " "+e1.getName()); 
			
		 }
		 input.close();	
	}

	public static void main(String[] args) throws SQLException,IOException, ClassNotFoundException  {
		// TODO Auto-generated method stub
		
		Reader reader=new FileReader("D:/abc1.txt");
		OutputStream out=new FileOutputStream("D:/emp_ser_1.txt");
		TestJdbcEmpApp.seFile(out);
		TestJdbcEmpApp.serializeEmployee();
		TestJdbcEmpApp.deSerialize("D:/emp_ser_1.txt");
		
		BufferedReader br=new BufferedReader(reader);
		String str= br.readLine();
		//System.out.println(str);
		 
		 while((str=br.readLine())!=null)
		 {
			 //System.out.println(str);
			  String[] inputs= str.split(",");
			int id=Integer.parseInt(inputs[0].trim());
			String empName=inputs[1];
			String empAddress=inputs[2];
			String email=inputs[3];
			long phone=Long.parseLong(inputs[4]);
			float salary=Float.parseFloat(inputs[5]);
			 System.out.println(id + " "+empName+ " "+empAddress + " "+email + " "+phone+ " "+salary);
			 Employee e=new Employee(id, empName,salary, email, phone, empAddress);
				int k= service.addEmployee(e);
				 if(k>=1)
				 {
					 System.out.println("Data inserted");
					 //  service.viewAllEmployee().forEach(emp->System.out.println(emp.getId()+ " "+emp.getName() +" "+emp.getEmail()+ " "+emp.getSal()));	 
				 }
			 
		 }
		 List<Employee> list=service.viewAllEmployee();
		 FileWriter writer=new FileWriter("D:/employeeInfo1.csv",true);
		 for(Employee emp:list ) {
			long empId=emp.getId();
			String empName=emp.getName();
			double empSalary=emp.getSal();
			String empEmail=emp.getEmail();
			long empPhn=emp.getPhone();
			String empAddress=emp.getAddres();
			writer.write(String.valueOf(empId));
			writer.write(",");
			writer.write(empName);
			writer.write(",");
			writer.write(String.valueOf(empSalary));
			writer.write(",");
			writer.write(empEmail);
			writer.write(",");
			writer.write(String.valueOf(empPhn));
			writer.write(",");
			writer.write(empAddress);
			writer.write(",");
			writer.write("\n");	
		 }
		 writer.close();
		 
		 
		/* Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter employee id");
		 int id=Integer.parseInt(scanner.nextLine());
		 
		 System.out.println("Enter employee name");
		String empName=scanner.nextLine();
		 System.out.println("Enter employee address");
		String empAddress=scanner.nextLine();
		 System.out.println("Enter employee mail");
		String emial=scanner.nextLine();
		System.out.println("Enter employee phone");
		 long empPhone=Long.parseLong(scanner.nextLine());
		 System.out.println("Enter employee salary");
		 float salary=Float.parseFloat(scanner.nextLine());
		 Employee e=new Employee(id, empName,salary, emial, empPhone, empAddress);
		int k= service.addEmployee(e);
		 if(k>=1)
		 {
			 System.out.println("Data inserted");
			   service.viewAllEmployee().forEach(emp->System.out.println(emp.getId()+ " "+emp.getName() +" "+emp.getEmail()+ " "+emp.getSal())); 
		 } 
		 	System.out.println("Employee detail by particular id");
		  Employee e1=service.getEmployeeById(11);
		  System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getEmail()+" "+e1.getAddres()+" "+e1.getSal());
		  
		  System.out.println("Delete Employee details");
		  Employee e2=service.removeEmployeeById(13);
		  service.viewAllEmployee().forEach(emp->System.out.println(emp.getId()+ " "+emp.getName() +" "+emp.getEmail()+ " "+emp.getSal()));
		  */
		  
	}

}
