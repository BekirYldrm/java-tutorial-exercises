package oops.abstraction;

public class GameRunner {

	public static void main(String[] args) {

		MarioGame marioGame = new MarioGame();
		marioGame.execute();

		System.out.println("///////////////////////////////////////////////////");

		CheeseGame cheeseGame = new CheeseGame();
		cheeseGame.execute();
	}

}
