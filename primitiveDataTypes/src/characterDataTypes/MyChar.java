package characterDataTypes;

public class MyChar {
	
	private char ch ;

	public MyChar(char character) {
		
		this.ch = character ; 
	}

	public boolean isVowel() {
				
		if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false ; 
	}
	
	

	public boolean isDigit() {
		
		if( ch >= 48 && ch<= 57) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		
		if(ch>=97 && ch<=122 ) {
			return true ; 
		}
		
		else if (ch>=65 && ch<=90 ) {
			return true;
		}
		
		return false;
		
	}

	public static void printLowerCaseAlphabets() {
		for(char ch =  'a' ; ch <= 'z' ; ch++ ) {
			System.out.println(ch);
		}
		
	}

	public static void printUpperCaseAlphabets() {
		for(char ch =  'A' ; ch <= 'Z' ; ch++ ) {
			System.out.println(ch);
		}
		
	}

	public  boolean isConsonant() {
		
		if(ch >= 97 && ch<= 122 && ch !='a' && ch !='e' && ch !='i' && ch !='o' && ch !='u') {
			return true;
		}
		
		return false;
	}

}
