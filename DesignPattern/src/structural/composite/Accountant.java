package structural.composite;

public class Accountant implements Employee {

	private int id;
	private String name;
	private double salary;

	public Accountant(int id, double salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public int getId() {

		return id;
	}

	@Override
	public double getSalary() {

		return salary;
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public void addEmployee(Employee emp) {

	}

	@Override
	public void removeEmployee(Employee emp) {

	}

	@Override
	public void print() {
		System.out.println("Employee Name :" + getName());
		System.out.println("Employee Id :" + getId());
		System.out.println("Employee Salary :" + getSalary());
		System.out.println("============Employee details ends===========");

	}

	@Override
	public Employee getChild(int i) {

		return null;
	}

}
