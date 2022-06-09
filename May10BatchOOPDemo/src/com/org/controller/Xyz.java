package com.org.controller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;
class Employee1 {
    
    String name;
    int salary;
    public Employee1(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public void setName(){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int salary){  
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
    enum SortMethod {
        BYNAME,BYSALARY;
    };
    public  static List<Employee1> sort(List<Employee1> emps,final SortMethod method){
        String methods=method.name();
        if(methods.equals("BYNAME")){
            Comparator<Employee1> compareByName = Comparator.comparing(Employee1::getName);
           //collect(Collectors.toList()
           return emps.stream().sorted(compareByName).collect(Collectors.toList());
           }
        else if(methods.equals("BYSALARY")){
           // Comparator<Employee1> compareBySalary = Comparator.comparingInt(Employee1:: getSalary);
            return emps.stream().sorted((o1,o2)->{
            	if(o1.getSalary()==o2.getSalary())
            		return o1.getName().compareTo(o2.getName());
            	else if(o1.getSalary()>o2.getSalary())
            		return 1;
            	else
            		return -1;
            }).collect(Collectors.toList());
        }            
        else 
            return null;
    }
    public static boolean  isCharacterPresentInAllNames(Collection<Employee1> entities, String character){
    	
       List<Employee1>list= entities.stream().filter(p->p.getName().startsWith(character)).collect(Collectors.toList());
        if(list.isEmpty())
        	return false;
        return 
        		true;
     }
}

public class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1> emps = new ArrayList<>();
		emps.add(new Employee1("Mickey", 100000));
		emps.add(new Employee1("Timmy", 40000));
		emps.add(new Employee1("Annny", 40000));
		
		List<Employee1>ls=EmployeeInfo.sort(emps,EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(ls);
		System.out.println(EmployeeInfo.isCharacterPresentInAllNames(ls,"a"));

	}

}
