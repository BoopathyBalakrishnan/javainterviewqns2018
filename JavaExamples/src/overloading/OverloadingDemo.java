package overloading;

public class OverloadingDemo {

	public void set(byte i) {
		System.out.println("Printing byte");
	}
	
	public void set(short i) {
		System.out.println("Printing short");
	}

	public void set(long i) {
		System.out.println("Printing long");
	}

	public void set(int i) {
		System.out.println("Printing int");
	}
	
	public void set(float i)
	{
		System.out.println("Printing float");
	}
	
	public void set(double i)
	{
		System.out.println("Printing double");
	}

	public static void main(String[] args) {

		OverloadingDemo demo = new OverloadingDemo();
		demo.set(1.1);

	}

}
