package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		
		// creation
		List<String> words = List.of("Apple" , "Cat" , "Bat");
		List<String> wordsArrayList = new ArrayList<>(words);
		
		
		// Loop 
		for(String word: wordsArrayList) {
			
			if(word.endsWith("at")) {
				System.out.println(word);
			}
			
		}
		
		// iterator 
		Iterator<String> iterator = wordsArrayList.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}
		
		System.out.println(wordsArrayList);
		
		

	}

}
