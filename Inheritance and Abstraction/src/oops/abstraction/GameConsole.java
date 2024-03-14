package oops.abstraction;

public abstract class GameConsole { // abstract Class
	
	public void execute() {
		up(); 	
		down(); 
		left(); 	
		right();
	}
	
	// abstract Methods
	
	abstract void up(); 
	abstract void down();
	abstract void left();
	abstract void right();

}
