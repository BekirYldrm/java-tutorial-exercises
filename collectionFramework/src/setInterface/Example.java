package setInterface;

import java.util.HashSet;
import java.util.Set;

public class Example {

	public static void main(String[] args) {

		Set<String> Set1 = Set.of("Apple" , "Bat" , "Cat");
		
		Set<String> HashSet = new HashSet<>(Set1);
		
		System.out.println(HashSet);
		
		HashSet.add("Zat");
		System.out.println(HashSet);
		
		

	}

}
