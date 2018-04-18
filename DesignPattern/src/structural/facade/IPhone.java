package structural.facade;

public class IPhone implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("IPhone");

	}

	@Override
	public void price() {
		System.out.println("price is 20K");

	}

}
