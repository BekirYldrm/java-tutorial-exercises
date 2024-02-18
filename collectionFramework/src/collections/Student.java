package collections;

public class Student implements Comparable<Student>{
	
	//state
	private int id;
	private String name;
	
	
	// constructor
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	// behavior
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// object print
	public String toString() {
		return id + " " + name ;
	}


	 
	//implements
	@Override
	public int compareTo(Student that) {
		
		return Integer.compare(that.id, this.id);
	}

}
