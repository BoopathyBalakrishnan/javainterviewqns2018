package algorithm.linkedlist;

public class MyLinkedList<T> {

	Node<T> head;
	Node<T> tail;

	public void add(T data) {
		Node<T> newNode = new Node<T>();
		newNode.setData(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setLink(newNode);
			tail = newNode;
		}
	}

	public void remove(T data) {
		Node<T> node = head;
		Node<T> targetNode = null;
		Node<T> previousNode = null;
		while (node != null) {
			if (node.getData().equals(data)) {
				targetNode = node;
				break;
			}
			previousNode = node;
			node = node.getLink();
		}

		if (targetNode == null) {
			System.out.println("Data is not found in linked list");
		} else {
			if (previousNode == null) {
				head = node = node.getLink();
			} else {
				previousNode.setLink(targetNode.getLink());
				if (targetNode.getLink() == null) {
					tail = previousNode;
				}
			}
		}

	}

	public void removeFirst() {
		if (head != null) {
			head = head.getLink();
			if (head == null) {
				tail = null;
			}
		}
	}

	public void removeDupliacate() {
		Node<T> node = head;
		Node<T> nextNode = null;
		while (node != null) {
			nextNode = node;

			while (nextNode.getLink() != null) {

				if (node.getData().equals(nextNode.getLink().getData())) {

					nextNode.link = nextNode.getLink().getLink();
				} else {
					nextNode = nextNode.getLink();
				}

			}

			node = node.getLink();
		}
	}

	public void detectLoop() {
		Node<T> node1 = head;
		Node<T> node2 = head;

		while (node1 != null && node2 != null && node2.getLink() != null) {
			node1 = node1.getLink();
			node2 = node2.getLink().getLink();
			if (node1 == node2) {
				System.out.println("Loop detected");
			}
		}

	}

	public void reverse() {
		Node<T> current = head;
		Node<T> prev = null;
		Node<T> next = null;
		while (current != null) {
			next = current.getLink();
			current.link = prev;
			prev = current;
			current = next;
		}

		head = prev;
	}

	public void iterate() {
		Node<T> iterateNode = head;
		while (iterateNode != null) {
			System.out.println(iterateNode.getData());
			iterateNode = iterateNode.getLink();
		}
	}

}
