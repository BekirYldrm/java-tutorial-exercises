package oops.level2.Inheritance;

public class Person {
	
	//state
	private String name;
	private String email;
	private String phoneNumber;
	
	
	public Person (String name) {
		
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String toString () {  // method overriding in Java
		return String.format("name: %s , email: %s , phone number: %s ", name , email , phoneNumber);
	}
	
	

}
