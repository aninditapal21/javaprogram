package com.org.serviceimpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.org.model.Employee;
import com.org.service.EmployeeService;

public class EmployeeDao implements EmployeeService{
	static Connection con;
	public static Connection getConnect() {
		Connection  con=null;
		try {
			Class.forName("org.postgresql.Driver");
			final String URL="jdbc:postgresql://localhost:5432/May10BatchDB";
			final String USERNAME="postgres";
			final String PASSWORD="@ninditaPal21";
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}catch(ClassNotFoundException ce)
		{
			System.out.println(ce.getMessage());
		}
		catch(SQLException se)
		{
			System.out.println(se.getMessage());
		}
		return con;
	}
	

	@Override
	public int addEmployee(Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=getConnect();
		//I want parameterized query
		//empid,empName,empMail,empAddr, empPhone, empSalary,30
		String insertQuery="insert into Employee values(?,?,?,?,?,?)";
		//Parameterized query can be executed using PreparedStatement
		// we can get the object of PreparedStatement by calling the method of Connection interface
		// PreparedStatement prepareStatement(String sql)throws SQLException
			PreparedStatement ps=  con.prepareStatement(insertQuery);
			ps.setLong(1, emp.getId() );
			ps.setString(2,emp.getName());
			ps.setString(3, emp.getAddres());
			ps.setString(4, emp.getEmail());
			ps.setLong(5, emp.getPhone());
			ps.setDouble(6, emp.getSal());
			//insert, update, delete
			int status=ps.executeUpdate();
			  
			con.close();
			return status;
			}

	@Override
	public List<Employee> viewAllEmployee() {
		// TODO Auto-generated method stub
		
		List<Employee> listOfEmp=new ArrayList();
		Connection con=getConnect();
		try {
			PreparedStatement ps=con.prepareStatement("select * from Employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				//I fetching from DB server
				   // getInt(int columnIndex)
				   //getInt(column Name)
				int eId=rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				String mail=rs.getString(4);
				long ph=rs.getLong(5);
				float sal=rs.getFloat(6);
				//I am going set all this with the object of employee
				Employee e=new Employee(eId, name, sal, mail, ph, address);
				listOfEmp.add(e);
			}
		}
		catch(SQLException se) {
			System.out.println(se.getMessage());
		}
		return  listOfEmp;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Connection con=getConnect();
		Employee emp=null;
		try {
			PreparedStatement ps=con.prepareStatement("select * from Employee where empid=?");
			ps.setInt(1, empId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				int eId=rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				String mail=rs.getString(4);
				long ph=rs.getLong(5);
				float sal=rs.getFloat(6);
				//I am going set all this with the object of employee
				emp=new Employee(eId, name, sal, mail, ph, address);
			}
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return emp;
	}

	@Override
	public Employee removeEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Connection con=getConnect();
		Employee emp=null;
		try {
			PreparedStatement ps=con.prepareStatement("delete from employee where empid=?");
			ps.setInt(1, empId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				int eId=rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				String mail=rs.getString(4);
				long ph=rs.getLong(5);
				float sal=rs.getFloat(6);
				//I am going set all this with the object of employee
				emp=new Employee(eId, name, sal, mail, ph, address);
			}
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return emp;
		//return null;
	}

	@Override
	public int updateEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Connection con=getConnect();
		try {
			PreparedStatement ps=con.prepareStatement("update employee ");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

}
