package algorithm.stack;

public class MyStack<E> {

	private int size = 0;
	private Object[] table;
	private static final int CAPACITY = 10;

	public MyStack() {
		table = new Object[CAPACITY];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public void push(E element) {
		if (size == CAPACITY) {
			System.out.println("Stack is full");
		} else {
			table[size++] = element;
		}
	}

	public E pop() {
		if (size == 0) {
			System.out.println("stack is empty");
			return null;
		} else {
			E element =  (E) table[--size];
			return element;
		}
	}

}
