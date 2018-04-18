package behavioral.observer;

public class CustomerA implements Observer {

	@Override
	public void update(int interest) {
		System.out.println("Customer A new interset rate is " + interest);

	}

}
