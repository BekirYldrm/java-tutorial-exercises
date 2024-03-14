package tasks.task3;

public class Rectangle {
	
	
	//State
	private int shortEdge;
	private int longEdge;
	
	//Constructor
	public Rectangle(int longEdge, int shortEdge) {
		
		this.shortEdge = shortEdge;
		this.longEdge = longEdge;
	}


	//Setter and Getter Methods
	public int getShortEdge() {
		return shortEdge;
	}

	public void setShortEdge(int shortEdge) {
		this.shortEdge = shortEdge;
	}

	public int getLongEdge() {
		return longEdge;
	}

	public void setLongEdge(int longEdge) {
		this.longEdge = longEdge;
	}


	//Behavior

	public int calculateArea() {
		
		return shortEdge * longEdge;
	}
	
	public int calculatePerimeter() {
		
		return 2*(shortEdge + longEdge);
	}
	
	
	@Override
	public String toString() {
		
		return "Area: " + calculateArea() + "\nPerimeter:" + calculatePerimeter() ; 
	}
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(70, 90);
		
		System.out.println(rectangle);
		
	}
	
	
	
}
