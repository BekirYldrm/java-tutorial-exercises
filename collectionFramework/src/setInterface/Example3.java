package setInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example3 {

	public static void main(String[] args) {
		
		List<Character> characters = List.of('A' , 'Z' , 'A' , 'B' , 'Z', 'F' );
		
		Set<Character>  hashSet = new HashSet<>(characters);
		
		Set<Character>  linkedHashSet = new LinkedHashSet<>(characters);
		
		Set<Character>  treeSet = new TreeSet<>(characters);
		
		System.out.println("hashSet : " + hashSet);
		
		System.out.println("linkedHashSet : " + linkedHashSet);
		
		System.out.println("treeSet : " + treeSet);

	}

}
