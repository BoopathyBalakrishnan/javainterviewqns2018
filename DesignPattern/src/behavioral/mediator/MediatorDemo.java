package behavioral.mediator;

/*
 * Mediator pattern is used to reduce communication complexity between multiple objects 
 * or classes. This pattern provides a mediator class which normally handles all the 
 * communications between different classes and supports easy maintenance of the code 
 * by loose coupling. Mediator pattern falls under behavioral pattern category.
 */
public class MediatorDemo {

	public static void main(String[] args) {

		User user = new User("java");
		User user1 = new User("j2ee");
		user.sendMessage("Hi j2ee");
		user1.sendMessage("Hi java");

	}

}
