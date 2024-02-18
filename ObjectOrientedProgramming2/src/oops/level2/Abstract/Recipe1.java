package oops.level2.Abstract;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() { //implement abstract method
		System.out.println("prepare");
		
	}

	@Override
	void doTheDish() { //implement abstract method
		System.out.println("recipe");
		
	}

	@Override
	void cleanUp() { //implement abstract method
		System.out.println("clean up");
		
	}
	
	

}
