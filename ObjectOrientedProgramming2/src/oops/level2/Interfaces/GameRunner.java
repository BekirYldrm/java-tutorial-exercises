package oops.level2.Interfaces;

public class GameRunner {

	public static void main(String[] args) {
		// GamingConsole game2 = new MarioGame();

		// MarioGame game = new MarioGame();

		// CheeseGame game = new CheeseGame();

		GamingConsole[] games = { new MarioGame(), new CheeseGame() };

		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();

		}

	}

}
