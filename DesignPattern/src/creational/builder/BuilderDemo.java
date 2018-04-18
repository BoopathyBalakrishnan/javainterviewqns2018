package creational.builder;

/*
 * Builder pattern builds a complex object using simple objects and using a step by step 
 * approach. This type of design pattern comes under creational pattern as this pattern provides 
 * one of the best ways to create an object.

A Builder class builds the final object step by step. This builder is independent of other 
objects.
 */
public class BuilderDemo {

	public static void main(String[] args) {
		ItemBuilder builder = new ItemBuilder();
		builder.orderItem(new Pepsi());
		builder.orderItem(new NonVegBurger());
		builder.orderItem(new VegBurger());
		builder.orderItem(new Slice());

		builder.getOrderDetails();
	}

}
