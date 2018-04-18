package dao;

import java.util.List;

public interface StudentDAO {

	public void updateStudent(Student student);

	public void deleteStudent(Student student);

	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

}
