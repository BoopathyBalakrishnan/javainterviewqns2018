package cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;

public class Computation1 implements Runnable {

	public static int product = 0;

	@Override
	public void run() {
		product = 2 * 3;
		try {
			Tester.barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

}
