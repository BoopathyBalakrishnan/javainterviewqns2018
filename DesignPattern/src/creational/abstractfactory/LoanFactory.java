package creational.abstractfactory;

public class LoanFactory implements AbstractFactory {

	@Override
	public Bank getBank(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loanName) {

		if (loanName.equals("Home")) {
			return new HomeLoan();
		}
		if (loanName.equals("Car")) {
			return new CarLoan();
		}
		return null;
	}

}
