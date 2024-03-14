package tips.nestedClass;

class Person {

}

public class NestedClassRunner {
	
	int i ;

	class InnerClass {
		
		public void method() {
			i=8;
		}

	}

	static class StaticNestedClass {
		
	}

	public static void main(String[] args) {
		
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		
		NestedClassRunner nestedClassRunner = new NestedClassRunner(); 
		
		InnerClass innerClass = nestedClassRunner.new InnerClass();
		
		

	}

}
