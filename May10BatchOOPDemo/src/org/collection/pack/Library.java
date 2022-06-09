package org.collection.pack;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Member>memberList=new ArrayList<Member>();

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
	public void addMember(Member memberObj) {
		memberList.add(memberObj);
	}
	public List<Member> viewAllMember(){
		return memberList;
	}
	public List<Member>viewMemberByAddress(String address){
		List<Member>lib1=new ArrayList();
		for(int i=0;i<memberList.size();i++) {
			if(memberList.get(i).getAddress().equals(address)) {
				lib1.add(memberList.get(i));
				return lib1;
			}
			else {
          		 System.out.println("none of the member is from "+address);
          	 }
		}
		return null;
		
		
	}
}
