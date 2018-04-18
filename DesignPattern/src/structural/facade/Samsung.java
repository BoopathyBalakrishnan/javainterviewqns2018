package structural.facade;

public class Samsung implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("samsung mobile");
		
	}

	@Override
	public void price() {
		System.out.println("price is 10K");
		
	}

}
