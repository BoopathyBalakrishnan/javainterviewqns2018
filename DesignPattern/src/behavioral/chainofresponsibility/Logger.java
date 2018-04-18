package behavioral.chainofresponsibility;

public abstract class Logger {

	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;
	protected Logger logger;

	protected int level;

	public void setNextLogger(Logger logger) {
		this.logger = logger;
	}

	public void logMessage(int logLevel) {
		if (level == logLevel) {
			write();
		} else {
			if (logger != null) {
				logger.logMessage(logLevel);
			}
		}
	}

	public abstract void write();

}
