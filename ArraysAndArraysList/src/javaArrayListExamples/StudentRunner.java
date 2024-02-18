package javaArrayListExamples;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		
		Student student = new Student("bekir" , 98,97,95,78);
		
		int number = student.getNumberOfMarks();
		System.out.println("number of marks: " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Total Sum : " + sum);
		
		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum mark: " + maximumMark);
		
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum mark: " + minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average mark: " + average);
		
		System.out.println(student.toString());
		
		student.addNewMark(45);
		System.out.println(student.toString());
		
		student.removeMarkAtIndex(1);
		System.out.println(student.toString());

		

	}

}
