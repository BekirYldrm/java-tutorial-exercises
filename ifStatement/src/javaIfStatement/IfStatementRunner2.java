package javaIfStatement;

public class IfStatementRunner2 {
	
	public static void main(String[] args) {
		puzzle3();
	}

	private static void puzzle() {
		int k = 7;
		
		if (k > 20) {
			System.out.println(1);
		} else if (k > 10) {
			System.out.println(2);
		} else if (k < 20) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}
	
	private static void puzzle3() {
		int k = 15;
		
		if (k <20) {
			k += 10;
		}
		else {
			++k;
		}
		 System.out.println(k);
	}
	
	

}