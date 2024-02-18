package functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		List<String> list = List.of("Apple", "Cat", "Bat" , "Dog");

		printWithFilthering(list);

	}


	private static void print(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}
	
	private static void printWithFilthering(List<String> list) {
		list.stream().
		filter(element -> element.endsWith("at")).  // intermediate Operation
		forEach(element -> System.out.println(element));   //Terminal Operation
	} 

}
