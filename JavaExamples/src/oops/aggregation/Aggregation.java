package oops.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Aggregation {

	public static void main(String[] args) {

		Student student1 = new Student(1, "java");
		Student student2 = new Student(2, "jsp");
		Student student3 = new Student(3, "servlet");
		Student student4 = new Student(4, "hibernate");
		Student student5 = new Student(5, "spring");

		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);

		Department dept1 = new Department("IT", students);
		Department dept2 = new Department("CSE", students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(dept1);
		departments.add(dept2);

		Institute institute = new Institute("JAVA", departments);
		
		System.out.println("Total no of students in "+institute.getName()+" is "+institute.getTotalStudentsInInstitute());

	}

}
