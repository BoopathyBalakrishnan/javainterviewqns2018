package structural.bridge;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCricle(int radius, int x, int y) {
		System.out.println("Drawing red circle radius=" + radius + " x=" + x + " y=" + y);

	}

}
