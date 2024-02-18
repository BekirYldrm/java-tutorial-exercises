package oops.level2.Inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	// state
	private String title;
	private String employer;
	private char employeeGrade;
	private BigDecimal salary;
	
	
	
	public Employee(String name , String title) {
		super(name);
		this.title = title;
	}
	
	
	//methods
	public String getTitle() {
		return title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
	
	
	
	public String toString() { //overriding
		
		return super.toString() + String.format("title: %s , employer: %s , employee grade: %s , salary: %f" , 
			 title , employer , employeeGrade , salary);
	}




}
