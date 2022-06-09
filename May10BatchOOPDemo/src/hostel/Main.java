package hostel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Hosteller hostel=getHostellerDetails();
		System.out.println("The Student Details:");
		System.out.println(hostel.getStudentId()+" "+hostel.getName()+" "+hostel.getDepartmentId()+" "+hostel.getGender()+" "+hostel.getPhone()+" "+hostel.getHostelName()+" "+hostel.getRoomNumber());
		
	}
	public static Hosteller getHostellerDetails() {
		Hosteller hostel=new Hosteller();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Details:");
		System.out.println("Student Id");
		int id=sc.nextInt();
		hostel.setStudentId(id);
		sc.nextLine();
		System.out.println("Student Name");
		String name=sc.nextLine();
		hostel.setName(name);
		System.out.println("Department Id");
		int deptId=sc.nextInt();
		sc.nextLine();
		hostel.setDepartmentId(deptId);
		System.out.println("Gender");
		String gen=sc.nextLine();
		hostel.setGender(gen);
		System.out.println("Phone Number");
		String phn=sc.nextLine();
		hostel.setPhone(phn);
		System.out.println("Hostel Name");
		String hosName=sc.nextLine();
		hostel.setHostelName(hosName);
		System.out.println("Room Number");
		int rmNum=sc.nextInt();
		sc.nextLine();
		hostel.setRoomNumber(rmNum);
		System.out.println("Modify Room Number(Y/N)");
		String chk=sc.nextLine();
		if(chk.equalsIgnoreCase("Y")) {
			System.out.println("New Room Number");
			int nwRmNum=sc.nextInt();
			sc.nextLine();
			hostel.setRoomNumber(nwRmNum);
		}
		if(chk.equalsIgnoreCase("N") || chk.equalsIgnoreCase("Y")) {
			System.out.println("Modify Phone Number(Y/N)");
			String chk1=sc.nextLine();
			if(chk1.equalsIgnoreCase("y")) {
				System.out.println("New Phone Number");
				String nwPhnNum=sc.nextLine();
				hostel.setPhone(nwPhnNum);
			}		
				
		}
		return hostel;
	}

}
