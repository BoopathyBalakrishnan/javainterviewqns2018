package algorithm.hashmap;

public class MyHashMapDemo {

	public static void main(String[] args) {
		MyHashMap<Integer, Integer> myHashMap = new MyHashMap<Integer, Integer>();
		myHashMap.put(21, 12);
		myHashMap.put(25, 121);
		myHashMap.put(30, 151);
		myHashMap.put(33, 15);
		myHashMap.put(35, 89);
		myHashMap.iterate();

		System.out.println(myHashMap.get(33));
		System.out.println(myHashMap.remove(33));
		myHashMap.iterate();

	}

}
