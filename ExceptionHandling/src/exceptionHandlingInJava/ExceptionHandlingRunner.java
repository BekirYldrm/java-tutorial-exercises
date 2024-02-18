package exceptionHandlingInJava;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		System.out.println("Main Started");
		method1();
		System.out.println("Main Ended");

	}

	private static void method1() {
		System.out.println("Method1 Started");
		method2();
		System.out.println("Method1 Ended");
	}

	private static void method2() {
		System.out.println("Method2 Started");
		
		String str = null;
		str.length();
		
		System.out.println("Method2 Ended");
	}

}
