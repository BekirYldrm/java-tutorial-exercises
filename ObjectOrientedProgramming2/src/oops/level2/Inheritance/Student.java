package oops.level2.Inheritance;

public class Student extends Person {
	
	//state
	private String collage;
	private int year;
	
	
	public Student (String name , String collage) {
		super(name);
		this.collage = collage;
	}
	

	public String getCollage() {
		return collage;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return String.format("name: %s , email : %s , phone number : %s , collage : %s , year : %d",
				getName() ,getEmail(), getPhoneNumber() , collage , year );
	}
	
	

}
