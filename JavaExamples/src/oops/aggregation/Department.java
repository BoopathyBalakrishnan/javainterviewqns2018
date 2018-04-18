package oops.aggregation;

import java.util.List;

public class Department {

	private String name;

	private List<Student> students;

	public Department(String name, List<Student> students) {
		this.name = name;
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public List<Student> getStudents() {
		return students;
	}

}
