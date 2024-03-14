package oops.inheritance;

public class Teacher extends Person {
	
	// state
	private String title;
	private String branch;

	//constructor
	public Teacher(String name, int age, String title) {
		super(name, age);
		this.title = title;
	}

	//behavior
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {

		return "name: " + super.getName() + " age: " + super.getAge() + " mail: " + super.getEmail() + " branch: "
				+ this.getBranch() + " title: " + this.getTitle();
	}

}
