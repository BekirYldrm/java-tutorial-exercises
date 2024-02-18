package oop;

public class Book {
	// state
	
	private int noOfCopies;  // member variables
	
	// Behaviour
	
	public Book(int noOfCopies) { 	// constructor method
		this.noOfCopies = noOfCopies;
	}
	
	void setnoOfCopies(int noOfCopies) { 	// encapsulation
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}
	

}
