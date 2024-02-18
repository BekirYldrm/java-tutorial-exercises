package functionalProgramming;

import java.util.List;

public class FPNumberRunner {
	
	public static void main(String[] args) {
		
		List<Integer> numbers =List.of(4,6,8,13,3,15);
		
		numbers.stream().
		forEach(number -> System.out.println(number));
		
		
		System.out.println(fpSum(numbers));
		

		

		
	}
	
	
	//Functional Programming
	 private static int fpSum(List<Integer> list) {
		
		return list.stream().reduce(0,(number1 ,number2) ->  number1 + number2);
		
	}
	 
	 
	 // Procedural Programming
	 private static int normalSum(List<Integer> list) {
		 
		 int sum = 0;
		 for(int number : list) {
			 sum += number;  //mutation
		 }
		 
		 return sum;
	 }

}
