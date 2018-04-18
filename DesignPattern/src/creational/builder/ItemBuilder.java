package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {

	private List<Item> items = new ArrayList<Item>();

	public void orderItem(Item item) {
		items.add(item);
	}

	private float calculatePrice() {
		float totalPrice = 0;

		for (Item item : items) {
			totalPrice = totalPrice + item.price();
		}

		return totalPrice;
	}

	public void getOrderDetails() {
		for (Item item : items) {

			System.out.println("Name=" + item.name());
			System.out.println("Price=" + item.price());
			System.out.println("Pack=" + item.packing().pack());
		}
		System.out.println("Total price=" + calculatePrice());
	}

}
