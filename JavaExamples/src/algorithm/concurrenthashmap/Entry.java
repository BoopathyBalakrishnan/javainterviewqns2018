package algorithm.concurrenthashmap;

public class Entry<K, V> {
	
	private K key;
	private volatile V value;
	private Entry<K,V> next;
	private int hash;
	

}
