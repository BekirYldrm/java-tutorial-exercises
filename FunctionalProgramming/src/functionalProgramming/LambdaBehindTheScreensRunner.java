package functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaBehindTheScreensRunner {

	public static void main(String[] args) {

		List.of(23, 43, 34, 45, 36, 48).stream().
		filter(new EvenNumberPredicate()).
		map(new NumberSquareMapper()).
		forEach(new SystemOutConsumer());

	}

}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println("result=> " + number);

	}

}

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		// TODO Auto-generated method stub
		return number % 2 == 0;
	}

}

class NumberSquareMapper implements Function<Integer , Integer> {

	@Override
	public Integer apply(Integer number) {
		
		return number * number;
	}
	
}