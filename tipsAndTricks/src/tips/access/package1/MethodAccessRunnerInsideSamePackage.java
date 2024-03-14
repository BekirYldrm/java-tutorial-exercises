package tips.access.package1;

public class MethodAccessRunnerInsideSamePackage {

	public static void main(String[] args) {
	
		ExampleClass example = new ExampleClass();
		
		// example.privateMethod();
		
		example.publicMethod();
		
		example.protectedMethod();
		
		example.defaultMethod();

	}

}
