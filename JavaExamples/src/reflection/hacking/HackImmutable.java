package reflection.hacking;

import java.lang.reflect.Field;

public class HackImmutable {

	public static void main(String[] args) throws Exception {
		
		Immutable immutable = new Immutable(10, "java");
		System.out.println("id="+immutable.getId()+" name:"+immutable.getName());
		Class cls = immutable.getClass();
		Field field = cls.getDeclaredField("id");
		field.setAccessible(true);
		field.set(immutable, 20);
		System.out.println("id="+immutable.getId()+" name:"+immutable.getName());

	}

}
