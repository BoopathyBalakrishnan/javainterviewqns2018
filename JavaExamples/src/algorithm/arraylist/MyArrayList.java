package algorithm.arraylist;


public class MyArrayList<T> {

	private Object[] table;
	private int capacity = 3;
	private int size = 0;

	public MyArrayList() {
		table = new Object[capacity];
	}

	public int size() {
		return size;
	}

	public void add(T value) {

		if (size == capacity) {

			increaseCapacity(value);

		} else {
			table[size++] = value;
		}

	}

	private void increaseCapacity(T value) {
		Object[] temp = new Object[capacity];
		for (int i = 0; i < table.length; i++) {
			temp[i] = table[i];
		}
		capacity = (capacity * 3) / 2 + 1;

		table = new Object[capacity];
		for (int i = 0; i < temp.length; i++) {
			table[i] = temp[i];
		}
		table[size++] = value;
	}

}
