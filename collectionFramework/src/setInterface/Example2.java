package setInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {

	public static void main(String[] args) {
		
		Set<Integer> numbersHashSet = new HashSet<>();
		
		numbersHashSet.add(20);
		numbersHashSet.add(200);
		numbersHashSet.add(2000);
		numbersHashSet.add(20000);
		System.out.println(numbersHashSet);

		Set<Integer> numbersLinkedSet = new LinkedHashSet<>();
		numbersLinkedSet.add(20);
		numbersLinkedSet.add(200);
		numbersLinkedSet.add(2);
		numbersLinkedSet.add(20000);
		System.out.println(numbersLinkedSet);
		
		Set<Integer> numbersTreeSet = new TreeSet<>();
		numbersTreeSet.add(26);
		numbersTreeSet.add(2);
		numbersTreeSet.add(125);
		numbersTreeSet.add(78);
		System.out.println(numbersTreeSet);
		
	}

}
