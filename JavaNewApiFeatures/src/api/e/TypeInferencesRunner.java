package api.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {

		List<String> names1 = List.of("Adem", "Eve");
		
		List<String> names2 = List.of("John", "Ravi");
		
		var names = List.of(names1,names2);
		
		names.stream().forEach(System.out::println);
		
		
		for(var name: names2) {
			System.out.println(name);
		}
		
		var filter = names1.stream().filter(name -> name.length()<4);
		
		filter.forEach(System.out::println);

	}

}
