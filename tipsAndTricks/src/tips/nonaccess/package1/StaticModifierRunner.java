package tips.nonaccess.package1;


class Player {
	
	private String name;
	static private int count;

	public Player(String name) {
		super();
		this.name = name;
		count ++;
	}

	static public int getCount() {
		//System.out.println(name);
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class StaticModifierRunner {

	public static void main(String[] args) {
		
		Player player1 = new Player("Ronaldo");
		
		System.out.println(Player.getCount());
		
		Player player2 = new Player("Messi");
		
		System.out.println(Player.getCount());
		
		
		

	}

}
