package servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {

	private List<Service> services;

	public Cache() {
		services = new ArrayList<Service>();
	}

	public Service getService(String serviceName) {
		for (Service service : services) {
			if (service.name().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning cached  " + serviceName + " object");
				return service;
			}
		}
		return null;
	}

	public void addService(Service addService) {
		boolean exists = false;
		for (Service service : services) {
			if (service.name().equalsIgnoreCase(addService.name())) {
				exists = true;
				break;
			}
		}

		if (!exists) {
			services.add(addService);
		}
	}

}
