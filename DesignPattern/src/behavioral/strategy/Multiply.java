package behavioral.strategy;

public class Multiply implements Strategy {

	@Override
	public int doOperation(int a, int b) {

		return a * b;
	}

}
