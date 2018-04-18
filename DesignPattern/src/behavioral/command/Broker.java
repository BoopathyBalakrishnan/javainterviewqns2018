package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<Order> orders = new ArrayList<Order>();

	public void addOrder(Order order) {
		orders.add(order);
	}

	public void displayOrders() {
		for (Order order : orders) {
			order.execute();
		}
	}

}
