package algorithm.linkedhashmap;

import algorithm.hashmap.Entry;

public class MyLInkedHashMap<K, V> {

	private int capacity = 16;
	private Entry<K, V>[] table;
	private Entry<K, V> head;
	private Entry<K, V> tail;
	private String operationFalg;

	public MyLInkedHashMap() {
		table = new Entry[capacity];
	}

	public void put(K key, V value) {
		operationFalg = "add";
		if (key == null) {
			return;
		}
		Entry<K, V> newEntry = new Entry<K, V>();
		newEntry.setKey(key);
		newEntry.setValue(value);
		int hashCode = hash(key);
		if (table[hashCode] == null) {
			table[hashCode] = newEntry;
		} else {
			Entry<K, V> getEntry = table[hashCode];
			Entry<K, V> previousEntry = null;
			while (getEntry != null) {
				if (getEntry.getKey().equals(key)) {
					getEntry.setValue(value);
					break;
				}
				previousEntry = getEntry;
				getEntry = getEntry.getLink();
			}
			if (previousEntry != null) {
				previousEntry.setLink(newEntry);
			}
		}
		maintainOrder(newEntry);
	}

	public boolean remove(K key) {
		operationFalg = "remove";
		boolean exists = false;

		int hashCode = hash(key);
		Entry<K, V> entry = table[hashCode];
		Entry<K, V> previousEntry = null;
		if (entry != null) {
			if (entry.getKey().equals(key)) {

				exists = true;
				table[hashCode] = null;
			} else {
				while (entry != null) {
					if (entry.getKey().equals(key)) {
						exists = true;
						break;
					}
					previousEntry = entry;
					entry = entry.getLink();
				}
				if (exists) {
					previousEntry.setLink(entry.getLink());
				}
			}
		}

		return exists;
	}

	public void maintainOrder(Entry<K, V> entry) {
		if (operationFalg != null && operationFalg.equals("add")) {

			if (head == null) {
				head = entry;
				tail = entry;
			} else {
				tail.setLink(entry);
			}
		} else {

		}
	}

	private int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}

}
