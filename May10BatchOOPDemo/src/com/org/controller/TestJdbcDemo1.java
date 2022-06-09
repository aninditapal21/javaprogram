package com.org.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Employee1234
{
	private int id;
	private String name;
	public Employee1234(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}
/*
 * JDBC :java Database Connectivity
 * java Application -web application(web server-8080)//127.8.1.3
 * making order
 * Order----orderID,orderDate,Transaction,payment mode,address,mail,phone;
 * JDBC API
 * java.sql
 * 
 * Connection<Interface>
 * DriverManager<class>
 * Statement
 * 
 * Database Server
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class TestJdbcDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException  {

   // I want connect this java application with Relation database server(PostgresSQL)
	//we have load on database specific driver	
		//static Class forName(String className)throws ClassNotFoundException
	//	try
		//{
		// 
		//PostGresDB--specific driver org.postgresql.Driver
		/*
		 * load one dedicate component like driver class of particular database
		 * java---
		 * DB-server -sql language
		 * */
		//class forName(String input)throw ClassNotFoundException
		//any compiled class name is the valid string for forName()
		//org.postgresql.Driver is a package and Driver is a class
	Class.forName("org.postgresql.Driver");
	System.out.println("driver loaded");
	//Driver
	//address to the driver
	//url, username, password--- token Connection and runtime error
	// web server --Tomcat --port 8080
	//Data server --postgresSQL--5432
	// jdbc:postgresql://localhost:5432/name of the database
		final String url="jdbc:postgresql://localhost:5432/May10BatchDB";
			final String userName="postgres";
			final String password="@ninditaPal21";
			/*
			 * JDBC API
			 *          java.sql.
			 *          Connection<interface>
			 *          DriverManager.getConnection(url, username, password)
			 *          
			 *          Statement<interface>
			 *          PreParedStatement<interface>
			 *          CallableStatement<interface>
			 *          insert
			 *          delete
			 *          fetch
			 *          update
			 * 
			 * 
			 * 
			 */
			//Connection getConnection(String url, String userName, String password)
			Connection con=DriverManager.getConnection(url, userName, password);
			System.out.println(con);
		//I want to insert few records in Employee table in the same database
		//first transaction
		
		//Connection<interface>
		//Statement createStatement ()
		//Statement
		//insert, update and delete
		// int executeUpdate();
	Statement statement=con.createStatement();
	int status=	statement.executeUpdate("insert into Employee values(1235,'Ankit','A','a@gmail.com',5454,67676)");
		System.out.println(status);
	
		// ResultSet executeQuery(String sql)--
		//fetch all the record from table called Employee from database
		//select * from employee ---view
		String fetchQuery="select * from Employee";
		//ResultSet excuteQuary(String sql)throw SQLexception
		//Iterator
		//hasNext() next remove
	ResultSet rs=	statement.executeQuery(fetchQuery);
	//boolean next()--this method will return true if the resultset poiniting to valid row if not then false
		while(rs.next())
		{
			//getInt() getString() getDouble(),
			//getInt(int colIndex)--int
			//getInt(String colName)---
		int empId=  rs.getInt("empid");
		String empName=	  rs.getString(2);
		String empAddress=rs.getString(3);
		String empMail=rs.getString(4);
		long empPhone=rs.getLong(5);
		float empSal=rs.getFloat(6);
		System.out.println(empId + " "+empName + " "+empMail + " "+empPhone + " "+empSal);
		  //rs.getInt(1)
			
			
		}
		
		
		
		
		
		
		

	}

}