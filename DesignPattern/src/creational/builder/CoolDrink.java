package creational.builder;

public abstract class CoolDrink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}

}
