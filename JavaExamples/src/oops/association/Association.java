package oops.association;

public class Association {

	public static void main(String[] args) {
		Bank bank = new Bank("ICICI");
		Employee emp = new Employee("java");

		System.out.println("Bank Name: " + bank.getName() + " Employee Name: " + emp.getName());
	}

}
