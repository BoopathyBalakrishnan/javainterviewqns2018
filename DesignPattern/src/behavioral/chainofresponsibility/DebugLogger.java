package behavioral.chainofresponsibility;

public class DebugLogger extends Logger {

	public DebugLogger(int logLevel) {
		level = logLevel;
	}

	@Override
	public void write() {
		System.out.println("This is a debug logger");

	}

}
