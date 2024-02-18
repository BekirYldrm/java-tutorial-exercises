package oops.level2.Object_Composition;

public class Customer {
	
	// state (member variables)
	private String name;
	private Adress homeAdress;  // object composition
	private Adress workAdress;  // object composition
	
	
	// constructor (creation)
	public Customer (String name ,Adress homeAdress) {
		
		this.name = name;
		this.homeAdress = homeAdress;
	}
	
	//methods (operations)
	
	//setter methods
	
	public void setHomeAdress(Adress newHomeAdress) {  
		
		this.homeAdress = newHomeAdress;
	}
	
	public void setWorkAdress(Adress newWorkAdress) {
		
		this.workAdress = newWorkAdress;
	}
	
	// getter methods 
	
	public Adress getHomeAdress() {
		
		return homeAdress;
	}
	
	public Adress getWorkAdress() {
		
		return workAdress;
	}

	@Override
	public String toString() {
		return String.format("name - [%s]  , homeAdress - [%s] , workAdress - [%s] ", name , homeAdress , workAdress);
	}
	
	

}
