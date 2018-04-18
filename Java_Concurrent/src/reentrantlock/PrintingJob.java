package reentrantlock;

public class PrintingJob implements Runnable {

	private PrinterQueue printerQueue;
	
	public PrintingJob(PrinterQueue printerQueue)
	{
		this.printerQueue = printerQueue;
	}
	@Override
	public void run() {
		
		printerQueue.printJob();
	}

}
