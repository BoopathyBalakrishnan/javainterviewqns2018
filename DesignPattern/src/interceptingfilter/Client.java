package interceptingfilter;

public class Client {

	private FilterManager manager;

	public void setFilterManager(FilterManager manager) {
		this.manager = manager;
	}

	public void sendRequest(String request) {
		manager.filterRequest(request);
	}

}
