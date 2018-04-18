package servicelocator;

public class Service2 implements Service {

	@Override
	public void execute() {
		System.out.println("executing service2");

	}

	@Override
	public String name() {

		return "Service2";
	}

}
