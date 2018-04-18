package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory {

	private static final Map<String, Circle> circles = new HashMap<String, Circle>();

	public static Circle getCircle(String color) {
		Circle circle = circles.get(color);
		
		
		if (circle == null) {
			circle = new Circle(color);
			circles.put(color, circle);

			System.out.println("Creating new circle with color " + color);
		}

		return circle;
	}

}
