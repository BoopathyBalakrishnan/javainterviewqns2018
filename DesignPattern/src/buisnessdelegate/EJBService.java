package buisnessdelegate;

public class EJBService implements BuisnessService{

	@Override
	public void doProcessing() {
		System.out.println("Calling EJB service");
		
	}

}
