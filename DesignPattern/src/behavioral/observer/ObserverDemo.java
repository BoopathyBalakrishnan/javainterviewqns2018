package behavioral.observer;

/*
 * Observer pattern is used when there is one-to-many relationship between objects 
 * such as if one object is modified, its depenedent objects are to be notified automatically. 
 * Observer pattern falls under behavioral pattern category.
 */
public class ObserverDemo {

	public static void main(String[] args) {

		Observer customerA = new CustomerA();
		Observer customerB = new CustomerB();

		Loan loan = new Loan();
		loan.addObserver(customerA);
		loan.addObserver(customerB);
		loan.setInterset(10);

	}

}
