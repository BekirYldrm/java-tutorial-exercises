package javaArrayListExamples;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;


public class Student {
	
	// Member variables
	
	private String name ;  
	private ArrayList<Integer> marks =new ArrayList<>(); 

	
	//// Constructor method
	
	public Student(String str, int... elements) { 

		this.name = str;
		
		for(int element : elements) {
			
			this.marks.add(element);
		}
	}
	
	//Methods

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int element : marks) {
			sum += element;
		}
		return sum;
	}

	public int getMaximumMark() {
		
		return Collections.max(marks);
		 
	}

	public int getMinimumMark() {
		
		return Collections.min(marks) ;
	}

	public BigDecimal getAverageMarks() {
		
		int sum = getTotalSumOfMarks();  
		int numberOfElements = getNumberOfMarks();		
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(numberOfElements) , 3 , RoundingMode.UP);
		
		return average;
	}
	
	public String toString () {
		return name + marks ;
	}

	public void addNewMark(int element) {
		
		marks.add(element);
		
	}

	public void removeMarkAtIndex(int index) {
	
		marks.remove(index);
		
	}
	
}
