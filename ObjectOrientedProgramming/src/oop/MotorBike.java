package oop;

public class MotorBike {
	// State
	
	private int speed; 	// speed => member variable
	
	
	// Behavior
	MotorBike(){	 // default constructor method 
		this(8);
	}
	
	MotorBike(int speed){	 // constructor method for initial state
		this.speed = speed;
	}
	
	void start() {
		System.out.println("Start");
	}

	public int getSpeed() {  // level 1 encapsulation
		return speed;
	}

	public void setSpeed(int speed) { 	// level 1 encapsulation
		if(speed>0) {
			this.speed = speed;
		}
		
	}
	
	
	public void increaseSpeed(int howMuch) { 	// level 2 encapsulation
		setSpeed(this.speed + howMuch);
		
	}
	public void decreaseSpeed(int howMuch) { // level 2 encapsulation
		setSpeed(this.speed - howMuch);
		
	}

}
