package servicelocator;

public class Service1 implements Service {

	@Override
	public void execute() {
		System.out.println("Executing service1");

	}

	@Override
	public String name() {

		return "Service1";
	}

}
