package oops.level2.Object_Composition_Examples;

public class Review {
	
	//state
	private int id;
	private int rating;
	private String description;
	
	// creation
	public Review(int id, String description ,int rating) {
		super();
		this.id = id;
		this.rating = rating;
		this.description = description;
	}
	
	public String toString() {
		
		return "id : " + id + " description : " + description + " rating " +  rating ;
	}
	
	
	
	

}
