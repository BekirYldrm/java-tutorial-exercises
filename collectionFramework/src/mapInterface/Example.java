package mapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example {

	public static void main(String[] args) {
		
		Map<String, Integer> map = Map.of("A", 3 , "B" , 5 , "C" , 8);
		
		System.out.println(map.containsKey("Z"));
		
		System.out.println(map.containsValue(8));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
		Map<String, Integer> hashMap = new HashMap<>(map);
		
		hashMap.put("Z", 11);
		hashMap.put("A", 4);
		hashMap.put("D", 45);
		hashMap.put("K", 18);
		hashMap.put("R", 1);
		
		System.out.println(hashMap);
		
		
		
		
		Map<String , Integer> linkedHasMap = new LinkedHashMap<>(map);
		
		linkedHasMap.put("Z", 11);
		linkedHasMap.put("A", 4);
		linkedHasMap.put("D", 45);
		linkedHasMap.put("K", 18);
		linkedHasMap.put("R", 1);
		
		System.out.println(linkedHasMap);
		
		
		
		
		Map<String , Integer> treeMap = new TreeMap<>(map);
		
		treeMap.put("Z", 11);
		treeMap.put("A", 4);
		treeMap.put("D", 45);
		treeMap.put("K", 18);
		treeMap.put("R", 1);
		
		System.out.println(treeMap);
		
		

	}

}
