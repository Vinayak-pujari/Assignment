package member_Manipulation;

public class Member {
	private int memeberId;
	private String memberName;
	private String address;
	public Member(int memeberId, String memberName, String address) {
		super();
		this.memeberId = memeberId;
		this.memberName = memberName;
		this.address = address;
	}
	
	public Member () {
		
	}
	public int getMemeberId() {
		return memeberId;
	}
	public void setMemeberId(int memeberId) {
		this.memeberId = memeberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
