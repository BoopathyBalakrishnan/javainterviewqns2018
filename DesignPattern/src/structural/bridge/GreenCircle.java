package structural.bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCricle(int radius, int x, int y) {

		System.out.println("Drawing green circle radius=" + radius + " x=" + x + " y=" + y);

	}

}
