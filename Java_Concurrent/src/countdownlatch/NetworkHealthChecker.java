package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class NetworkHealthChecker extends Service {

	public NetworkHealthChecker(CountDownLatch latch) {
		super(latch, "NetworkHealthChecker");
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
