package behavioral.chainofresponsibility;

public class ErrorLogger extends Logger {

	public ErrorLogger(int logLevel) {
		level = logLevel;
	}

	@Override
	public void write() {
		System.out.println("This is error logger");

	}

}
