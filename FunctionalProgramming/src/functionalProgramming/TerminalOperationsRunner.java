package functionalProgramming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOperationsRunner {

	public static void main(String[] args) {
		
		int sum = IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(sum);
		
		Optional<Integer> max=List.of(23,12,34,53).stream().max((n1 , n2) -> Integer.compare(n1, n2));
		System.out.println(max.get());
		

		List<Integer> newList = List.of(23,12,34,53).stream().filter(e -> e%2 == 1).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> newList2 = IntStream.range(1, 11).map(e -> e*e).boxed().collect(Collectors.toList());
		System.out.println(newList2);

	}

}
