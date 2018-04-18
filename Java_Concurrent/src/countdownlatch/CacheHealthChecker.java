package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CacheHealthChecker extends Service {

	public CacheHealthChecker(CountDownLatch latch) {
		super(latch, "CacheHealthChecker");
	}

	@Override
	public void executeService() {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

		}

		System.out.println("CacheHealthChecker service is started");

	}

}
