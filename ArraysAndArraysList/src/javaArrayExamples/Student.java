package javaArrayExamples;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class Student {
	
	// Member variables
	
	private String str ;  
	private int[] marks ; 

	
	//// Constructor method
	
	public Student(String str, int... elements) { 
		
		this.marks = elements;
		this.str = str;
	
	}
	
	//Methods

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int element : marks) {
			sum += element;
		}
		return sum;
	}

	public int getMaximumMark() {
		int max = Integer.MIN_VALUE;
		
		for(int element: marks) {
			if (element >= max) {
				max = element;
			}
		}
		return max ;
	}

	public int getMinimumMark() {
		
		int min = Integer.MAX_VALUE;
		
		for(int element: marks) {
			if (element <= min) {
				min = element;
			}
		}
		return min ;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();  
		int numberOfElements = getNumberOfMarks();		
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(numberOfElements) , 3 , RoundingMode.UP);
		
		return average;
	}
}
