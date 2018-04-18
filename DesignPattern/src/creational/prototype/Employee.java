package creational.prototype;

public class Employee implements Prototype {

	private int id;
	private String name;
	private String designation;

	public Employee(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	@Override
	public Prototype getClone() {

		return new Employee(id, name, designation);
	}

	public void getEmployeeDetails() {
		System.out.println("id=" + id + " name=" + name + " designation=" + designation);
	}

}
