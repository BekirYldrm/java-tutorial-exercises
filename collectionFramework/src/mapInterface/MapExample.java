package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		String str = "This is an awesome occasion. This has never happened before.";
		
		Map<Character, Integer> occurances = new HashMap<>();
		
		char[] characters = str.toCharArray();
		
		for(char character : characters ) {
			Integer value = occurances.get(character);
			if(value == null) {
				occurances.put(character, 1);
			}
			else {
				occurances.put(character, value + 1);
			}
		}
		System.out.println(occurances);
		
		
		
		Map<String, Integer> stringOccurances = new HashMap<>();
		
		String[] words = str.split(" ");
		
		for(String word : words ) {
			Integer value = stringOccurances.get(word);
			if(value == null) {
				stringOccurances.put(word, 1);
			}
			else {
				stringOccurances.put(word, value + 1);
			}
		}
		System.out.println(stringOccurances);

	}

}
