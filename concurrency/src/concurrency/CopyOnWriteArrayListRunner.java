package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("Ant");
		list.add("Cat");
		list.add("Bat");
		
		for(String element : list) {
			System.out.println(element);
		}
		
		
	}

}
