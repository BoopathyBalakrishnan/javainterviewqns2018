package creational.abstractfactory;

public class BankFactory implements AbstractFactory {

	@Override
	public Bank getBank(String bankName) {
		if (bankName.equals("ICICI")) {
			return new ICICIBank();
		}
		if (bankName.equals("HDFC")) {
			return new HDFCBank();
		}
		return null;
	}

	@Override
	public Loan getLoan(String loanName) {

		return null;
	}

}
