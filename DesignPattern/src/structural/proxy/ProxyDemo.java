package structural.proxy;
/*
 * In proxy pattern, a class represents functionality of another class. 
 * This type of design pattern comes under structural pattern.

In proxy pattern, we create object having original object to interface its 
functionality to outer world.
 */
public class ProxyDemo {

	public static void main(String[] args) {

		Image image = new ProxyImage("test_10mb.jpg");
		image.display();

	}

}
