package exceptionHandlingInJava;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		
		try {
			someOtherMethod(); //Checked Exception 
			
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		someOtherMethod2(); //Unchecked Exception
		
		

	}
	private static void someOtherMethod2() throws RuntimeException {
		
	}

	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
		
	}

}
