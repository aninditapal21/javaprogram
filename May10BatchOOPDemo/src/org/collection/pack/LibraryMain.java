package org.collection.pack;

import java.util.List;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Library lib=new Library();
		while(true) {
			System.out.println("1.Add Member\n"
					+ "2.View All Members\n"
					+ "3.Search Member by address\n"
					+ "4.Exit\n"
					+ "");
			System.out.println("Enter your choice");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
				case 1:
						Member member=new Member();
						System.out.println("Enter the id:");
						int id=Integer.parseInt(sc.nextLine());
						member.setMemberId(id);
						System.out.println("Enter the name:");
						String name=sc.nextLine();
						member.setMemberName(name);
						System.out.println("Enter the address:");
						String address=sc.nextLine();
						member.setAddress(address);
						lib.addMember(member);
						break;
				case 2:
						List<Member> listOfMember=lib.viewAllMember();
						if(listOfMember!=null) {
							for(Member m:listOfMember) {
								System.out.println("Id:"+m.getMemberId()+"\nName:"+m.getMemberName()+"\nAddress:"+m.getAddress());
							}
						}
						else {
							System.out.println("the list is empty");
						}
						break;
				case 3:
						System.out.println("Enter the address:");
						String srchAddress=sc.nextLine();
						List<Member>newList=lib.viewMemberByAddress(srchAddress);
						for(Member m1:newList)
							System.out.println("Id:"+m1.getMemberId()+"\nName:"+m1.getMemberName()+"\nAddress:"+m1.getAddress());
						break;
				case 4:
						System.exit(0);
			}
		}
	}

}
