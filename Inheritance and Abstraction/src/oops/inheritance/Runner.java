package oops.inheritance;

public class Runner {

	public static void main(String[] args) {

		Person person = new Person("bekir", 22);

		Student student = new Student("Halil", 10, "Egemen İlk Öğretim Okulu");

		student.setEmail("student_halil@gmail.com");
		student.setYear(2);
		System.out.println(student);

		System.out.println("---------------------------------------------------");

		Teacher teacher = new Teacher("Faruk", 60, "Doçent");

		teacher.setEmail("teacher_faruk@gmail.com");
		teacher.setBranch("Mühendislik");

		System.out.println(teacher);

	}

}
