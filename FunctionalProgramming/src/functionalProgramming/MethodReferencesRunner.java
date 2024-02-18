package functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferencesRunner {
	
	public static void print(Integer number) {
		System.out.println("=> "+ number);
		
	}
	
	public static boolean isEven(Integer number) {
		return number % 2 == 1;
	}
	

	public static void main(String[] args) {

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
				.map(s -> s.length())
				.forEach(s -> System.out.println(s));
		
		System.out.println("--------------------------");

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
				.map(String::length)
				.forEach(System.out::println);
		
		System.out.println("--------------------------");
		

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
				.map(s -> s.length())
				.forEach(MethodReferencesRunner::print);
		
		System.out.println("--------------------------");
		
		Integer max = List.of(23,45,67,34).stream()
				.filter( MethodReferencesRunner::isEven)
				.max(Integer::compare)
				.orElse(0);
		
		System.out.println(max);
		System.out.println("--------------------------");
		

		
		
		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Consumer<? super Integer> evenConsumer = System.out::println;
		Function<? super Integer, ? extends Integer> evenMapper = n -> n * n;
		
		List.of(23,45,67,34).stream()
				.filter(evenPredicate)
				.map(evenMapper)
				.forEach( evenConsumer);
	}
	
	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n % 2 == 0;
	}


	

	

}
