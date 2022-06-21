package collection;

public class Contact {
	private long phoneNumber;
	private String name;
	private String Email;
	private enum gender{male,female}
	
	public Contact(long phoneNumber, String name, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		Email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + ", Email=" + Email + "]";
	};
	
	

}
