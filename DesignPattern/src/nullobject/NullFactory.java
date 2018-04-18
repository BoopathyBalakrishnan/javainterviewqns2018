package nullobject;

public class NullFactory {

	private String[] names = { "java", "j2ee", "jsp", "Servlet" };

	public Customer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				return new RealCustomer(names[i]);
			}
		}
		return new NullCustomer();
	}

}
