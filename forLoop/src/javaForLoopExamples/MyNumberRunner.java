package javaForLoopExamples;

public class MyNumberRunner {

	public static void main(String[] args) {

		MyNumber number = new MyNumber(5);
		
		System.out.println("sumUpton " + number.sumUpton());
		System.out.println("isPrime " + number.isPrime());
		System.out.println("sumOfDivisors " + number.sumOfDivisors());
		number.printANumberTriangle();
	}

}
