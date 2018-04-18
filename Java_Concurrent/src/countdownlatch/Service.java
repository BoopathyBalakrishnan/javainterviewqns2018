package countdownlatch;

import java.util.concurrent.CountDownLatch;

public abstract class Service implements Runnable {

	private CountDownLatch latch;
	private String serviceName;
	private boolean serviceup;

	public Service(CountDownLatch latch, String serviceName) {

		this.latch = latch;
		this.serviceName = serviceName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public boolean isServiceup() {
		return serviceup;
	}

	@Override
	public void run() {
		try {
			executeService();
			serviceup = true;
		} catch (Exception e) {
			serviceup = false;
			e.printStackTrace();
		} finally {
			if (latch != null) {
				latch.countDown();
			}
		}
	}

	public abstract void executeService();

}
