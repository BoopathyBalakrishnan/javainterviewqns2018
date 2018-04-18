package behavioral.chainofresponsibility;

public class InfoLogger extends Logger {

	public InfoLogger(int logLevel) {
		level = logLevel;
	}

	@Override
	public void write() {

		System.out.println("This is info logger");

	}

}
