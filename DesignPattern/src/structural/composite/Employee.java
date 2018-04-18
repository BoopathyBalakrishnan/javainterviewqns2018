package structural.composite;

public interface Employee {

	public int getId();

	public double getSalary();

	public String getName();

	public void addEmployee(Employee emp);

	public void removeEmployee(Employee emp);

	public void print();

	public Employee getChild(int i);

}
