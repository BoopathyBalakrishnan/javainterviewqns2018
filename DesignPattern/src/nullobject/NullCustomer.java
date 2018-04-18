package nullobject;

public class NullCustomer implements Customer {

	@Override
	public boolean isNull() {

		return true;
	}

	@Override
	public String getName() {

		return "Name is not available in DB";
	}

}
