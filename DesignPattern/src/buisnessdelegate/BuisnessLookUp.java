package buisnessdelegate;

public class BuisnessLookUp {

	public BuisnessService getBuisnessService(String serviceType) {
		if (serviceType.equals("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}

}
