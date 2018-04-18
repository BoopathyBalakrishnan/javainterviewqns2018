package creational.singleton;

public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	public static Singleton getObject() {
		return singleton;
	}

}
