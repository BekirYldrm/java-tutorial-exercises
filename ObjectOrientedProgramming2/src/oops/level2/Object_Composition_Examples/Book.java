package oops.level2.Object_Composition_Examples;

import java.util.ArrayList;

public class Book {

	// state
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<Review>(); // object composition
	
	//creation (constructor)
	public Book (int id ,String name ,String author) {
		
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	//behavior (methods)
	
	public void addReview(Review newReview) {
		
		this.reviews.add(newReview); //   [ {} , {} , {} , ... ]

	}
	
	public String toString() {
		return String.format("id = %d  name = %s  author = %s  Reviews = %s ", id, name , author , reviews);
	}
	
	
}
