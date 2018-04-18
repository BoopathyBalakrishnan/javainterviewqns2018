package countdownlatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ApplicationStartupUtil {
	
	private static List<Service> services = new ArrayList<Service>();
	
	public static void checkExternalServices() throws InterruptedException
	{
		CountDownLatch latch = new CountDownLatch(3);
		services.add(new NetworkHealthChecker(latch));
		services.add(new DatabaseHealthChecker(latch));
		services.add(new DatabaseHealthChecker(latch));
		
		Executor executor = Executors.newFixedThreadPool(3);
		for(Service service: services)
		{
			executor.execute(service);
		}
		latch.await();
		
		
	}
	
	public static void main(String[] args)
	{
		try {
			checkExternalServices();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
