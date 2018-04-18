package creational.abstractfactory;

public interface AbstractFactory {

	Bank getBank(String bankName);

	Loan getLoan(String loanName);

}
