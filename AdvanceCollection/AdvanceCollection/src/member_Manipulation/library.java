package member_Manipulation;

import java.util.*;

public class library {
	private List<Member> memberList=new ArrayList<Member>();
	public void setMemberList(List<Member> list1) {
		memberList=list1;
	}
	public List<Member> getMemberList(){
		return memberList;
	}
	public void addMember (Member memberobj) {
		memberList.add(memberobj);
	}
	public List<Member> viewAllMembers(){
		return memberList;
	}
	public List<Member> viewMemberByAddress(String address){
		List<Member> list = new ArrayList<Member>();
		for (Member obj:memberList) {
			if(obj.getAddress().equalsIgnoreCase(address)) {
				list.add(obj);
			}
		}
		return list;
	}

}
