package creational.factory;

public abstract class Plan {
	
	protected int rate;
	
	public abstract void rate();
	
	public void calculateBill(int units)
	{
		System.out.println("total amount"+(units*rate));
	}

}
