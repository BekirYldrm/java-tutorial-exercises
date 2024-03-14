package com.inheritance;

public class Student extends Person{
	
	
	
	
	public Student(String name, int age, String schoolName, int year) {
		super(name, age);
		this.schoolName = schoolName;
		this.year = year;
	}
	private String schoolName;
	private int year;
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public String toString() {
		
		return "name:" + getName() +" email:"+ geteMail() +" age:"+ getAge() + " schoolName:"+ getSchoolName() + "year:" +getYear() ;
	}
	
	

}
