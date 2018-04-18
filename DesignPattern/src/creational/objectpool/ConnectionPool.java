package creational.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ConnectionPool<T> {

	private Hashtable<T, Long> locked, unLocked;
	private long expirationTime;

	public ConnectionPool() {
		expirationTime = 30000;
		locked = new Hashtable<T, Long>();
		unLocked = new Hashtable<T, Long>();
	}

	public abstract T create();

	public abstract boolean validate(T type);

	public abstract void expire(T type);

	public synchronized void checkIn(T type) {
		locked.remove(type);
		unLocked.put(type, System.currentTimeMillis());
	}

	public synchronized T checkOut() {
		long now = System.currentTimeMillis();
		T t = null;

		if (unLocked.size() > 0) {
			Enumeration<T> object = unLocked.keys();
			while (object.hasMoreElements()) {
				t = object.nextElement();
				if ((now - unLocked.get(t)) > expirationTime) {
					unLocked.remove(t);
					expire(t);

				} else {
					if (validate(t)) {
						unLocked.remove(t);
						locked.put(t, now);
						return t;
					} else {
						unLocked.remove(t);
						expire(t);
					}
				}
			}
		}
		t = create();
		locked.put(t, now);
		return t;
	}

}
