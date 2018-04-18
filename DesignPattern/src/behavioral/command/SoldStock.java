package behavioral.command;

public class SoldStock implements Order {

	Stock stock;

	public SoldStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {

		stock.sellStock();
	}

}
