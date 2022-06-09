package com.org.serviceimpl;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Employee {
    String name;
    int salary;
    Employee (String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    public void setName(String name){
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
    public static List<Employee> sort(List<Employee> emps, final SortMethod method){
        String sortMethods=	method.name();
		//System.out.println(sortMethods);
	
		//System.out.println(sort.ordinal());
	if(sortMethods.equals("BYNAME"))
	{
		Comparator<Employee> m=(p1,p2)-> p1.getName().compareTo(p2.getName())>1 ? 1:-1;
		//Collectors.toList()
		return emps.stream().sorted(m).collect(Collectors.toList());
	}else if(sortMethods.equals("BYSALARY"))
	{
		Comparator<Employee> s=(p1,p2)-> p1.getSalary()< p2.getSalary() ? 1:-1;
		return emps.stream().sorted(s).collect(Collectors.toList());
	}
		
		
		return null;
	}
    /*public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
        String regex="[@!$#&*%]{1}[a-zA-Z]+]";


    }*/
}
public class EmployeeVerification{
	public static void main(String args[]) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Mickey", 100000));
		emps.add(new Employee("Timmy", 50000));
		emps.add(new Employee("Annny", 40000));
		
		 List<Employee> s1=   EmployeeInfo.sort(emps,EmployeeInfo.SortMethod.BYSALARY);
		 System.out.println(s1);
		 // s1.forEach(p->System.out.println(p.getName() + " "+p.getSalary()));

	}
}
