package spring.reflection;

import java.lang.reflect.Method;
import java.util.Map;

public class BeanMapper {

	public Object setBeanValues(String className, Map<String, Object> valueMap) {
		Class cls = null;
		Object obj = null;
		try {
			cls = Class.forName(className);
			Method[] methods = cls.getDeclaredMethods();
			obj = cls.newInstance();
			for (int i = 0; i < methods.length; i++) {
				methods[i].setAccessible(true);
				if (methods[i].getName().contains("set")) {
					methods[i].invoke(obj,valueMap
							.get(methods[i].getName().substring(3, methods[i].getName().length()).toLowerCase()));
				}
			}
		} catch (Exception e) {

		}
		
		return obj;
		
	}

}
