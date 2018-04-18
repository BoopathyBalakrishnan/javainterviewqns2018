package structural.composite;

/*
 * Composite pattern is used where we need to treat a group of objects in 
 * similar way as a single object. Composite pattern composes objects in term of 
 * a tree structure to represent part as well as whole hierarchy. This type of 
 * design pattern comes under structural pattern as this pattern creates a tree 
 * structure of group of objects.

This pattern creates a class that contains group of its own objects. This class provides 
ways to modify its group of same objects.

We are demonstrating use of composite pattern via following example in which 
we will show employees hierarchy of an organization.
 */
public class CompositeDemo {

	public static void main(String[] args) {

		Accountant account = new Accountant(3, 3000, "j2ee");
		Cashier cashier = new Cashier(2, 4000, "jsp");
		Manager manager = new Manager(1, 5000, "java");
		manager.addEmployee(cashier);
		manager.addEmployee(account);
		manager.print();

	}

}
