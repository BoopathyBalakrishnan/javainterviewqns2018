package buisnessdelegate;

public class JMSService implements BuisnessService {

	@Override
	public void doProcessing() {
		System.out.println("Calling JMSService");

	}

}
