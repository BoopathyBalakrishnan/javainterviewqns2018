package servicelocator;

public class InitialContext {

	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("Service1")) {
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("Service1")) {
			return new Service2();
		}
		return null;
	}

}
