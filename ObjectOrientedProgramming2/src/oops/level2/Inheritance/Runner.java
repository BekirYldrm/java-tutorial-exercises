package oops.level2.Inheritance;

import java.math.BigDecimal;

public class Runner {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("bekir");
		System.out.println(person1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Student student = new Student("Bekir" , "Inonu CE");
		
		student.setEmail("bekiryildirim.2508@gmail.com");
		student.setPhoneNumber("05468943387");
		
		student.setYear(4);
		System.out.println(student);
		
		
		
		Employee employee = new Employee("Halil" , "Full Stak Developer");
		
		employee.setEmail("halil@gmail.com");
		employee.setPhoneNumber("05448942145");
		
		employee.setEmployeeGrade('A');
		employee.setSalary(new BigDecimal ("50000"));
		
		System.out.println(employee);
		

		
		
		Person person = new Person("Hasan");
		
		person.setEmail("hasan.adsa@gmail.com");
		person.setPhoneNumber("054512452455");
		System.out.println(person);
		
		
	}

}
