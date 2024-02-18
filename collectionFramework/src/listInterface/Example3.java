package listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(100,101,102,103);  // Auto boxing
		
		List<Integer> numbersArrayList = new ArrayList<>(numbers);
		
		
		System.out.println(numbersArrayList.indexOf(102));
		
		// operations with wrapper class
		
		numbersArrayList.remove(Integer.valueOf(102));
		System.out.println(numbersArrayList);
		
		
		// sorting with collection sort static method
		
		List<Integer> numbers1 = List.of(70,3,12,2);  // Auto boxing
		List<Integer> numbersAl = new ArrayList<Integer>(numbers1);
		
		Collections.sort(numbersAl);
		System.out.println(numbersAl);

	}

}