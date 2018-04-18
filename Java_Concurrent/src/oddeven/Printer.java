package oddeven;

public class Printer {

	private boolean isOdd = false;

	public synchronized void printEvenNumber(int number) {
		try {
			while (isOdd == false) {
				wait();
			}

			System.out.println("even no " + number);
			isOdd = false;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void printOddNumber(int number) {
		try {
			while (isOdd == true) {
				wait();
			}
			System.out.println("odd number " + number);
			isOdd = true;
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
