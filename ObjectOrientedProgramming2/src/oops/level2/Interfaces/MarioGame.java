package oops.level2.Interfaces;

public class MarioGame  implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Jump");
		
	}

	@Override
	public void down() {
		System.out.println("bend down");
		
	}

	@Override
	public void left() {
		
		System.out.println("go back");
	}

	@Override
	public void right() {
		System.out.println("go forward");
		
	}

}
