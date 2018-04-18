package classloader;

public class Bar {

	public Bar(String a, String b) {
		System.out.println("Bar Constructor >>> " + a + " " + b);
	}

	public void printCL() {
		System.out.println("Calling Bar method");
	}
}