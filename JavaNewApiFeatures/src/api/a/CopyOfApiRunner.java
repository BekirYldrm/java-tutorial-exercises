package api.a;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {

		List<String> names =new ArrayList<String>();
		names.add("Adem");
		names.add("Eve");
		names.add("John");
		
		List<String> copyOfNames = List.copyOf(names);
		
		doNotChange(copyOfNames);
		System.out.println(copyOfNames);
		System.out.println(names);

	}

	private static void doNotChange(List<String> names) {
		names.add("xooxoxo");
		
	}

}
