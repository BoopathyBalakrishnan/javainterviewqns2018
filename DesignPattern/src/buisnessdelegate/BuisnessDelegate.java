package buisnessdelegate;

public class BuisnessDelegate {

	private BuisnessLookUp lookup = new BuisnessLookUp();
	private BuisnessService service;

	public void doTask(String serviceName) {
		service = lookup.getBuisnessService(serviceName);
		service.doProcessing();
	}

}
