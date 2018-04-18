package creational.factory;

public class PlanFactory {
	
	public Plan getObject(String factoryName)
	{
		if(factoryName.equals("domestic"))
		{
			return new DomesticPlan();
		}
		if(factoryName.equals("comercial"))
		{
			return new ComercialPlan();
		}
		return null;
	}

}
