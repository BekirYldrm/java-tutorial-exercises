package oop;

public class MotorBikeRunner {

	public static void main(String[] args) {
		
		MotorBike honda = new MotorBike(100); // initial state
		
		MotorBike ducati = new MotorBike();
		
		
		honda.start();
		ducati.start();
		
		ducati.setSpeed(60);
		ducati.increaseSpeed(100);
		honda.increaseSpeed(75);
		honda.decreaseSpeed(5); 
		
		
		
		System.out.printf("%d  %d " , honda.getSpeed() , ducati.getSpeed());
		
		

	}

}
