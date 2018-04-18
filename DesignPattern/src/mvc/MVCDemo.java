package mvc;

/*
 * MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to 
 * separate application's concerns.

Model - Model represents an object or JAVA POJO carrying data. It can also have logic 
to update controller if its data changes.

View - View represents the visualization of the data that model contains.

Controller - Controller acts on both model and view. It controls the data flow 
into model object and updates the view whenever data changes. It keeps view and model separate.
 */
public class MVCDemo {

	public static void main(String[] args) {

		Student model = retriveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();

	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo(10);
		return student;
	}

}
