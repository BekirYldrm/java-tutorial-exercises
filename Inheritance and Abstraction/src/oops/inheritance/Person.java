package oops.inheritance;

public class Person  {

	// state
	private String name;
	private String email;
	private int age;

	
	//constructor
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
	
	//behavior
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
