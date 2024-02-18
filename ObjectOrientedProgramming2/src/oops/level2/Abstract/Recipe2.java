package oops.level2.Abstract;

public class Recipe2 extends AbstractRecipe {

	@Override
	void getReady() { // implement abstract method
		System.out.println("prepare2");
		
	}

	@Override
	void doTheDish() { // implement abstract method
		System.out.println("recipe2");
		
	}

	@Override
	void cleanUp() { // implement abstract method
		System.out.println("clean up2");
		
	}

}
