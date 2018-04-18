package algorithm.concurrenthashmap;

import java.io.Serializable;
import java.util.concurrent.locks.ReentrantLock;

public class Segment<K,V> extends ReentrantLock implements Serializable{
	
	transient volatile Entry<K,V>[] table;

}
