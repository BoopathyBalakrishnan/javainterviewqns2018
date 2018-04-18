package oddeven;

public class OddEvenDemo {

	public static void main(String[] args) {

		Printer printer = new Printer();

		Thread t1 = new Thread(new TaskEvenOdd(printer, true, 100));
		Thread t2 = new Thread(new TaskEvenOdd(printer, false, 100));
		t1.start();
		t2.start();

	}

}
