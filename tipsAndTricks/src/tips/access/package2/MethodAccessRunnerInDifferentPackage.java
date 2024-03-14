package tips.access.package2;

import tips.access.package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage{

	public static void main(String[] args) {
	
		ExampleClass example = new ExampleClass();
		
		// example.privateMethod();
		
		example.publicMethod();
		
		//example.protectedMethod();
		
		//example.defaultMethod();

	}

}
