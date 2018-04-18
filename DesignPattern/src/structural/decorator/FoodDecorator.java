package structural.decorator;

public class FoodDecorator implements Food {

	private Food food;

	public FoodDecorator(Food food) {
		this.food = food;
	}

	@Override
	public String prepareFood() {

		return food.prepareFood();
	}

	@Override
	public double foodPrice() {

		return food.foodPrice();
	}

}
