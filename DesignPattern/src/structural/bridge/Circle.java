package structural.bridge;

public class Circle extends Shape {

	private int radius, x, y;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCricle(radius, x, y);
	}

}
