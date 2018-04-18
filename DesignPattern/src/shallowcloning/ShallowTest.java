package shallowcloning;

public class ShallowTest {

	public static void main(String[] args) {
		Course course1 = new Course("english", "science", "maths");
		Student student1 = new Student(1, "java", course1);
		Student student2;
		try {
			student2 = (Student) student1.clone();
			System.out.println(student1.course.subject2);
			student2.course.subject2 = "history";
			System.out.println(student1.course.subject2);
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}

	}

}
