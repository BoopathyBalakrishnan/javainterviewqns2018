package algorithm.hashmap;

public class Entry<K, V> {

	K key;
	V value;
	Entry<K, V> link;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Entry<K, V> getLink() {
		return link;
	}

	public void setLink(Entry<K, V> link) {
		this.link = link;
	}

}
