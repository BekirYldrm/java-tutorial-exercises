package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {   //comparator interface

	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentsCollectionRunner {

	public static void main(String[] args) {

		List<Student> studentList = List.of(new Student(1, "Bekir"), new Student(4, "Faruk"), new Student(3, "Eve"));

		List<Student> studentArrayList = new ArrayList<>(studentList);

		studentArrayList.add(new Student(2, "Adem"));

		System.out.println(studentArrayList);
		

		Collections.sort(studentArrayList);  // comparable interface

		System.out.println("Desc " + studentArrayList);

		
		// Collections.sort(studentArrayList , new DescendingStudentComparator());
		
		studentArrayList.sort(new AscendingStudentComparator());  // comparator interface
		System.out.println("Asc " + studentArrayList);

	}

}
