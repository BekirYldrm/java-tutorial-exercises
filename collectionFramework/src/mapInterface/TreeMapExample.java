package mapInterface;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String , Integer> treeMap = new TreeMap<>();
		
		treeMap.put("F", 25);
		treeMap.put("Z", 5);
		treeMap.put("L", 250);
		treeMap.put("A", 15);
		treeMap.put("B", 25);
		treeMap.put("G", 25);
		
		
		System.out.println(treeMap);
		
		System.out.println(treeMap.higherKey("B"));
		
		System.out.println(treeMap.ceilingKey("B"));
		
		System.out.println(treeMap.lowerKey("B"));
		
		System.out.println(treeMap.floorKey("B"));
		
		System.out.println(treeMap.firstKey());
		
		System.out.println(treeMap.lastKey());
		
		System.out.println(treeMap.subMap("B", "Z"));
	}

}
