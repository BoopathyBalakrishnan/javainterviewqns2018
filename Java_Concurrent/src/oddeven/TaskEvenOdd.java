package oddeven;

public class TaskEvenOdd implements Runnable {

	private Printer printer;
	private boolean isOdd;
	private int maxValue;

	public TaskEvenOdd(Printer printer, boolean isOdd, int maxValue) {
		this.printer = printer;
		this.isOdd = isOdd;
		this.maxValue = maxValue;
	}

	@Override
	public void run() {

		int number = isOdd == true ? 1 : 2;
		while (number <= maxValue) {
			if (isOdd) {
				printer.printOddNumber(number);
			} else {
				printer.printEvenNumber(number);
			}
			number = number + 2;
		}

	}

}
