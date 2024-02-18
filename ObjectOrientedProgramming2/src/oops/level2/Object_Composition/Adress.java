package oops.level2.Object_Composition;

public class Adress {
	
	//state
	private String line1;
	private String city;
	private String zip; //post code
	
	
	//creation (constructor)
	public Adress(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}


	
	public String toString() {
		return  line1 + " " + city + " " + zip ; 
	}
	
	
	
	

}
