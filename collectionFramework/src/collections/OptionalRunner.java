package collections;

import java.util.List;
import java.util.Optional;

public class OptionalRunner {

	public static void main(String[] args) {
		
	Optional<Integer> optional = List.of(23,45,67,12,84).stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1, n2));
	
	System.out.println(optional.isEmpty());
	
	System.out.println(optional.get());
	
	System.out.println(optional.isPresent());
	
	System.out.println("................................");
	
	
	Optional<Integer> optional2 = List.of(23,45,67).stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1, n2));
	
	System.out.println(optional2.isEmpty());
	
	System.out.println(optional2.isPresent());
	
	System.out.println(optional2.orElse(0));
	
	
	
	

	}

}
