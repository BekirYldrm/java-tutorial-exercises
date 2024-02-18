package exceptionHandlingInJava;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){

			int[] numbers = { 12, 2, 3, 45 };

			int number = numbers[6];
			
		}
	
	}

}
