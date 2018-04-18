package algorithm.linkedlist;

public class MyLinkedListDemo {

	public static void main(String[] args) {

		MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(40);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(30);
		linkedList.add(50);
		linkedList.add(70);
		linkedList.add(10);
		

		linkedList.iterate();
		System.out.println("iterate ends");
		linkedList.reverse();
		linkedList.iterate();
		System.out.println("reverse ends");
		linkedList.removeDupliacate();
		linkedList.iterate();

		

	}

}
