package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {

	private int id;
	private double salary;
	private String name;
	List<Employee> employees = new ArrayList<Employee>();

	public Manager(int id, double salary, String name) {
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
		employees.add(emp);

	}

	@Override
	public void removeEmployee(Employee emp) {
		employees.remove(emp);

	}

	@Override
	public void print() {

		System.out.println("Employee Name :" + getName());
		System.out.println("Employee Id :" + getId());
		System.out.println("Employee Salary :" + getSalary());
		System.out.println("============Employee details ends===========");

		Iterator<Employee> employee = employees.iterator();
		while (employee.hasNext()) {
			Employee emp = employee.next();
			emp.print();
		}

	}

	@Override
	public Employee getChild(int i) {

		return employees.get(i);
	}

}
