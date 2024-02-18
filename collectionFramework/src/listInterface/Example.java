package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {

	
	
	public static void main(String[] args) {
		
		// creation
		List<String> words = List.of("Apple" , "Cat" , "Bat");
		
		List<String> newList = List.of("Yak" , "Zebra");
		
		List<String> wordsArrayList = new ArrayList<String>(words); 
		
		
		//add
		wordsArrayList.add("Dog");
		wordsArrayList.add(2, "Ball");
		wordsArrayList.addAll(newList);
		
		//change
		
		wordsArrayList.set(5, "Fish");
		
		//remove
		
		System.out.println(wordsArrayList);
		wordsArrayList.remove(1);
		wordsArrayList.remove("Dog");
		
		System.out.println(wordsArrayList);
		
		
		
		//Loop
		
		for(int i = 0 ; i<wordsArrayList.size(); i++) {
			System.out.println(wordsArrayList.get(i));
		}
		
		for(String word : wordsArrayList) {
			System.out.println(word);
			
		}
		
		//iterator
		
		Iterator wordsIterator = wordsArrayList.iterator();
		
		while(wordsIterator.hasNext()) {
			
			System.out.println(wordsIterator.next());
		}
		
	}

}