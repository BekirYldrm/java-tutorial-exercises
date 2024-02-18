package oops.level2;

public class FanRunner {
	
	public static void main(String[] args) {
		Fan fan = new Fan("Philips" , 0.458 , "GREEN");  // initial state
		
		fan.switchOn();
		System.out.println(fan); // print the state
		
		fan.setSpeed((byte) 3);
		System.out.println(fan); 
		
		fan.switchOff();
		System.out.println(fan); 
		

		
		
	}

}
