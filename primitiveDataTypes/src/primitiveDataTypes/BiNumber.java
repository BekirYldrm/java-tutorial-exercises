package primitiveDataTypes;

public class BiNumber { 
	
	private int number1, number2 ;  // member variables (state)
	
	public BiNumber(int number1 , int number2) {  // constructor method for initial state
		
		this.number1 = number1; 
		this.number2 = number2;
	}
	
	public int add () {
		
		return number1 + number2; 
	}
	public int multiply () {
		
		return number1 * number2; 
	}
	 public void doubleValue () {
		number1 = number1* 2; 
		number2 = number2 * 2; 
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}
	
	
	


}
