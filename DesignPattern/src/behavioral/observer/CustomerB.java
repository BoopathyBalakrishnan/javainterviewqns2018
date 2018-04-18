package behavioral.observer;

public class CustomerB implements Observer {

	@Override
	public void update(int interest) {
		System.out.println("Customer B new interset rate is " + interest);

	}

}
