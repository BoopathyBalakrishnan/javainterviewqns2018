package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

	List<Student> students;

	public StudentDAOImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student(0, "java");
		Student student2 = new Student(1, "j2ee");
		students.add(student1);
		students.add(student2);

	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());

	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());

	}

	@Override
	public List<Student> getAllStudents() {

		return students;
	}

	@Override
	public Student getStudent(int rollNo) {

		return students.get(rollNo);
	}

}
