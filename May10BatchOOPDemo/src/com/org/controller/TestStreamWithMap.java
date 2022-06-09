package com.org.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

class Candidate
{
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	
	
	
	public Candidate( int id, String name,int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
	
	
}


public class TestStreamWithMap {
	
	//we have pass this list to this method called getCount()
	//we have to number male and female and return as a map
	public static Map<String,Long> getCount(List<Candidate> list)
	{	//list.stream().collect(Collectors.groupingBy(null))
		Map<String, Long> map=list.stream().collect(Collectors.groupingBy(Candidate::getGender, Collectors.counting()));
		return map;
	}
	public  static Map<String, Double> getAvgAge(List<Candidate> list){
	    
		Map<String, Double> map1=list.stream().collect(Collectors.groupingBy(Candidate:: getGender,Collectors.averagingDouble(Candidate::getAge)));
		
		return map1;
  }
	/*public static Map<String, Double> getAvgAge(List<Candidate> list)
	{
		
		Map<String, Double> map1=list.stream().collect(Collectors.groupingBy(Candidate:: getGender,Collectors.averagingDouble(Candidate::getAge) ));
		
		return map1;
		
	}*/
	public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list)
	{
		Optional<Candidate> con= list.stream().filter(c->c.getGender().equalsIgnoreCase("male")).min(Comparator.comparing(Candidate::getAge));
		return con;
		
	}
	public static void main(String[] args)
	{
		//List<Candidate> listOfCandidates=new ArrayList();
		/*listOfCandidates.add(new Candidate("abc", 1, 34, "male", "A", 2021, 2345.70));
		listOfCandidates.add(new Candidate("XYZ", 2, 39, "female", "B", 2022, 7345.70));
		listOfCandidates.add(new Candidate("PQR", 3, 34, "male", "C", 2018, 2345.70));*/
		List<Candidate> list = new ArrayList<>();
		  list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		  list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
		//calling getCount method
		Map<String, Long> map1=getCount(list);
		Map<String, Double> map2=getAvgAge(list);
		//Optional<Candidate> 
		
	/*	 Set<String> set1= map1.keySet();
		Iterator<String> itr=set1.iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			long value=map1.get(key);
			System.out.println(key + " "+value);
			
		}
		/*
		 * interface Map
		 * {
		 * interfcae Entry
		 * {
		 * getKey()
		 * getValue()
		 * }
		 * 
		 */
	/*Set<Map.Entry<String, Long>> set2=	map1.entrySet();
		
		
		for(Map.Entry<String, Long> me:set2)
		{
			System.out.println(me.getKey() + " "+me.getValue());
		}
		*/
		
		map1.entrySet().forEach(entry->System.out.println(entry));
		map2.entrySet().forEach(entry->System.out.println(entry));
		
		
		//calling getAvgAge method
		 
	}
	

	
	

}