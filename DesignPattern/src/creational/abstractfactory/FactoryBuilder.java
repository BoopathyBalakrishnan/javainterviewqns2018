package creational.abstractfactory;

public class FactoryBuilder {

	public AbstractFactory getFactory(String factoryName) {
		if (factoryName.equals("Bank")) {
			return new BankFactory();
		}
		if (factoryName.equals("Loan")) {
			return new LoanFactory();
		}
		return null;
	}

}
