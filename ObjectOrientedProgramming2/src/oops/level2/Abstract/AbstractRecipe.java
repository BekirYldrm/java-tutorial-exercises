package oops.level2.Abstract;

public abstract class AbstractRecipe { // abstract Class
	
	public void execute() {
		getReady(); 	
		doTheDish(); 
		cleanUp(); 	    
	}
	
	// abstract Methods
	
	abstract void getReady(); 
	abstract void doTheDish();
	abstract void cleanUp();

}
