package behavioral.iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		CustomList list = new CustomList();
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
