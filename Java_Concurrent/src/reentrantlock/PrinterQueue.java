package reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterQueue {

	private final Lock reentrantLock = new ReentrantLock();

	public void printJob() {
		reentrantLock.lock();
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());

		} catch (InterruptedException e) {

		} finally {
			reentrantLock.unlock();
		}

	}

}
