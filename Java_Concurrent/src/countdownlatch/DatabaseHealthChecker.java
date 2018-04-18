package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class DatabaseHealthChecker extends Service {

	public DatabaseHealthChecker(CountDownLatch latch) {
		super(latch, "DatabaseHealthChecker");
	}

	@Override
	public void executeService() {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

		}

		System.out.println("NetworkHealthChecker service is started");

	}

}
