package setInterface;

import java.util.Set;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Example4 {

	public static void main(String[] args) {
		
		NavigableSet<Integer> numbersTreeSet = new TreeSet<>(Set.of(65,54,34,12,99));
		
		
		System.out.println(numbersTreeSet.lower(30));
		System.out.println(numbersTreeSet.floor(34));
		System.out.println(numbersTreeSet.ceiling(38));

		System.out.println(numbersTreeSet.subSet(38,87));
		System.out.println(numbersTreeSet.headSet(40));
		System.out.println(numbersTreeSet.tailSet(40));
		
		
		System.out.println(numbersTreeSet);

	}

}
