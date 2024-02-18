package functionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class IntermediateOperationsRunner {

	public static void main(String[] args) { // filter , map , distinct , sorted , ....

		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.println(e));

		List.of("Apple", "Ant", "Cat").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

		List.of("Apple", "Ant", "Cat").stream().map(e -> e.length()).forEach(e -> System.out.println(e));
	}

}
