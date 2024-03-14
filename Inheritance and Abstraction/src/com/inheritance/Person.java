package com.inheritance;

public class Person {
	
	private String name;
	private String eMail;
	private int age;
	
	
	public Person(String name, int age) {
		
		this.name=name;
		this.age=age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public String toString() {
		
		return "name:" + getName() +" email:"+ geteMail() +" age:"+ getAge() ;
	}
	
	
	
	

}
