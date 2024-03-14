package tips.access.package1;

public class ExampleClass {
	
	public void publicMethod() {
		System.out.println("public");
	}
	
	protected void protectedMethod() {
		System.out.println("protected");
	}
	
	private void privateMethod() {
		System.out.println("private");
	}

	void defaultMethod() {
		System.out.println("default");
	}
	
	
	public static void main(String[] args) {
		
		ExampleClass example = new ExampleClass();
		
		example.privateMethod();
		
		example.publicMethod();
		
		example.protectedMethod();
		
		example.defaultMethod();
		
	}

	
}
