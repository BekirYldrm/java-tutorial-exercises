package oops.level2;

public class Rectangle {
	 // state
	private int length;
	private int width;
	
	
	// constructor(creation)
	public Rectangle(int length , int width) {
		
		this.length = length;
		this.width = width;
	}
	
	// methods (operations)
	
	public void setLength(int newLength) {
		this.length = newLength;
	}
	
	public void setWidth(int newwidth) {
		this.width = newwidth;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int area() {
		int area = length * width;
		return area;
	}
	
	public int perimeter() {
		int perimeter = (length + width) * 2 ;
		return perimeter;
	}
	
	
	
	// print the state
	public String toString() {
		
		return String.format(
				"length - %d , width - %d , area - %d , perimeter - %d", 
				length , width , area() , perimeter()
				);
	}

}
