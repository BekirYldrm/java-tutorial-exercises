package exceptionHandlingInJava;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scan = null;
		
		try {
			
			scan = new Scanner(System.in);
			
			int[] numbers = {12,2,3,45};
			
			int number = numbers[6];	
		}
		
		catch(Exception e) {
			e.printStackTrace();	
		}
		
		finally {
			System.out.println("Before Scanner Close");
			
			if(scan != null) {
				scan.close();
			}
		}
		
		System.out.println("Just before closing out main");
	}

}
