package shallowcloning;

public class Student implements Cloneable {

	int id;
	String name;
	Course course;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(int id, String name, Course course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

}
