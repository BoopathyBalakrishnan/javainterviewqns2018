package oops.aggregation;

import java.util.List;

public class Institute {

	private String name;
	private List<Department> departments;

	public Institute(String name, List<Department> departments) {
		this.name = name;
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public int getTotalStudentsInInstitute() {
		int totalStudents = 0;

		for (Department dept : departments) {
			totalStudents = totalStudents + dept.getStudents().size();
		}

		return totalStudents;
	}

}
