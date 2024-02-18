package oops.level2.Interfaces;

public class CheeseGame  implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Movie piece up");
		
	}

	@Override
	public void down() {
		System.out.println("Movie piece down");
		
	}

	@Override
	public void left() {
		System.out.println("Movie piece left");
		
	}

	@Override
	public void right() {
		System.out.println("Movie piece right");
		
	}

}
