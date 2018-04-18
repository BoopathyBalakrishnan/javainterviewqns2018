package behavioral.chainofresponsibility;

/*
 * As the name suggests, the chain of responsibility pattern creates a chain of receiver 
 * objects for a request. This pattern decouples sender and receiver of a request based on 
 * type of request. This pattern comes under behavioral patterns.

In this pattern, normally each receiver contains reference to another receiver. 
If one object cannot handle the request then it passes the same to the next receiver and so on.
 */
public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {

		ChainOfResponsibilityDemo chain = new ChainOfResponsibilityDemo();
		Logger logger = chain.createChain();
		logger.logMessage(Logger.INFO);

	}

	public Logger createChain() {
		DebugLogger debug = new DebugLogger(Logger.DEBUG);
		ErrorLogger error = new ErrorLogger(Logger.ERROR);
		InfoLogger info = new InfoLogger(Logger.INFO);
		debug.setNextLogger(error);
		error.setNextLogger(info);
		return debug;
	}

}
