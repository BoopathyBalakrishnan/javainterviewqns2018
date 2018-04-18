package structural.facade;

public class ShopKeeper {

	private MobileShop samsung;
	private MobileShop iPhone;

	public ShopKeeper() {
		samsung = new Samsung();
		iPhone = new IPhone();
	}

	public void getSamsungPhone() {
		samsung.modelNo();
		samsung.price();
	}

	public void getIPhone() {
		iPhone.modelNo();
		iPhone.price();
	}

}
