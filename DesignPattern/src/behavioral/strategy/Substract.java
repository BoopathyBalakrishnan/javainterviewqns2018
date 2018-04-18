package behavioral.strategy;

public class Substract implements Strategy{
	
	@Override
	public int doOperation(int a, int b) {
		
		return a-b;
	}

}
