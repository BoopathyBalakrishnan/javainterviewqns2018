package reentrantlock;

public class LockExample {

	public static void main(String[] args) {
		PrinterQueue printerQueue = new PrinterQueue();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new PrintingJob(printerQueue));
			thread.start();
		}

	}

}
