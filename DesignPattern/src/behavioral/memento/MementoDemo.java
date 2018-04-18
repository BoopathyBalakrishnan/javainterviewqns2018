package behavioral.memento;

/*
 * Memento pattern is used to restore state of an object to a previous state. 
 * Memento pattern falls under behavioral pattern category.
 */
public class MementoDemo {

	public static void main(String[] args) {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("State1");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State2");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State3");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State4");
		careTaker.add(originator.saveStateToMemento());

		System.out.println("get first state " + careTaker.get(0).getState());
		System.out.println("get previous state " + careTaker.get(3).getState());

	}

}
