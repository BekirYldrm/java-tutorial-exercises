package genericsInJava;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {
	
	
	static <T> T doubleValue(T value) {
		return value;
	}
	
	
	static <X extends List> void duplicate(X list ) {
		list.addAll(list);
	}
	
	
	static double sumOfNumberList(List<? extends Number> numbers) { //Upper Bound
		
		double sum = 0.0;
		
		for(Number number: numbers) {
			sum += number.doubleValue();
		}
		
		return sum;
	}
	
	static void addACoupleOfValues (List<? super Number> numbers) { //Lower Bound
		
			numbers.add(1);
			numbers.add(1.8);
			numbers.add(7.6f);
			numbers.add(5l);
	}
	
	
	public static void main(String[] args) {
		
		//Example 1

		MyCustomList<Long> list = new MyCustomList<>();

		list.addElement(5l);
		list.addElement(13l);
		
		System.out.println(list.get(0));
		System.out.println(list);
		
	
		MyCustomList<Integer> list2 = new MyCustomList<>();

		list2.addElement(Integer.valueOf(8));
		list2.addElement(Integer.valueOf(5));
		
		System.out.println(list2.get(1));
		System.out.println(list2);
		
		
		
		//Example2
		
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
		duplicate(numbers);
		System.out.println(numbers);
		
		
		
		//Example3
		
		System.out.println(sumOfNumberList(List.of(1,2,3)));
		System.out.println(sumOfNumberList(List.of(6.8,2.14,3.49)));
		System.out.println(sumOfNumberList(List.of(7l,21l,45l)));
		
		
		//Example4
		
		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println(emptyList);
		
		
		
		//Example5
		
		String value1 = doubleValue(new String("adasda"));
		System.out.println(value1);
		
		Integer number1 = doubleValue(Integer.valueOf(18));
		System.out.println(number1);
		
		
		
	}
		

}
