package oops.inheritance;

public class Student extends Person {

	// state
	private String schoolName;
	private int year;

	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {

		return "name: " + super.getName() + " age: " + super.getAge() + " mail: " + super.getEmail() + " year: "
				+ this.getYear() + " school name: " + this.getSchoolName();
	}

}
