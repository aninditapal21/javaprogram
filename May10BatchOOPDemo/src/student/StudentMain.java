package student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student s;
		System.out.println("Enter Student's Id:" );
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student's Name:");
		String name=sc.nextLine();
		System.out.println("Enter Student address:");
		String address=sc.nextLine();
		while(true) {
			System.out.println("Whether the student is fromNIT(Yes/No)");
			String chk=sc.nextLine();
			if(chk.equalsIgnoreCase("yes")) {
				s=new Student(id,name,address);
				break;
			}
			else if(chk.equalsIgnoreCase("No"))
			{
				System.out.println("Enter the college name:");
				String clgName=sc.nextLine();
				s=new Student(id,name,address,clgName);
				break;
			}
			else
				System.out.println("Wrong Input");
		}
		System.out.println("Student id:"+s.getStudentId());
		System.out.println("Student name:"+s.getStudentName());
		System.out.println("Address:"+s.getStudentAddress());
		System.out.println("College name:"+s.getCollegeName());
	}

}
