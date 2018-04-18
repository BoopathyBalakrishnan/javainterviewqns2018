package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class SpringSetterInjection {

	public Object getObject() throws Exception {

		Class cls = Class.forName("reflection.Reflection1");
		Object object = cls.newInstance();
		Method[] methods = cls.getDeclaredMethods();
		//Field[] fields = cls.getDeclaredFields();

		for (int i = 0; i < methods.length; i++) {
			methods[i].setAccessible(true);
			Type[] types = methods[i].getGenericParameterTypes();
			Object[] objArray = new Object[types.length];
			if (methods[i].getName().contains("set")) {
				for (int j = 0; j < types.length; j++) {
					if (types[j].toString().contains("class")) {

						Class newClass = Class.forName(types[j].toString().substring(6, types[j].toString().length()));
						objArray[i] = newClass.newInstance();
					}
				}
				methods[i].invoke(object, objArray);
			}

		}

		return object;
	}

}
