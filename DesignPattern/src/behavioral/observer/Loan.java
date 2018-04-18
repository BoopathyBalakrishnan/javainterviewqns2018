package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Loan implements Subject {

	private int interset;

	List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {

		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {

		for (Observer observer : observers) {
			observer.update(interset);
		}
	}

	public int getInterset() {
		return interset;
	}

	public void setInterset(int interset) {
		this.interset = interset;
		notifyObservers();
	}

}
