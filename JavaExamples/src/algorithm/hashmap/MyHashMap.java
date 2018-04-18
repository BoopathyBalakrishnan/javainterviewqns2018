package algorithm.hashmap;

public class MyHashMap<K, V> {
	private Entry<K, V>[] table;
	private int capacity = 16;

	public MyHashMap() {
		table = new Entry[capacity];
	}

	public void put(K key, V value) {
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
	}

	public V get(K key) {
		V value = null;
		int hashCode = hash(key);
		Entry<K, V> entry = table[hashCode];
		while (entry != null) {
			if (entry.getKey().equals(key)) {
				value = entry.getValue();
				break;
			}
			entry = entry.getLink();
		}
		return value;
	}

	public boolean remove(K key) {
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

	private int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}

	public void iterate() {
		for (int i = 0; i < capacity; i++) {
			if (table[i] != null) {
				Entry<K, V> entry = table[i];
				while (entry != null) {
					System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
					entry = entry.getLink();
				}
			}
		}
	}

}
