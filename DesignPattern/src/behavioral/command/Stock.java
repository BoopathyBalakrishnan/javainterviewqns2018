package behavioral.command;

public class Stock {

	private String name = "test";
	private int price = 200;

	public void buyStock() {
		System.out.println("stock " + name + " is bought for rs " + price);
	}

	public void sellStock() {
		System.out.println("stock " + name + " is sold for rs " + price);
	}

}
