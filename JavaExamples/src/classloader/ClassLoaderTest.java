package classloader;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException {

		CustomClassLoader loader = new CustomClassLoader(ClassLoaderTest.class.getClassLoader());
		Class cls = loader.loadClass("classloader.Bar");
		 System.out.println("cls.getName() = " + cls.getName());
		 Constructor[] constructors = cls.getConstructors();
		 
		 System.out.println("constructors: "+Arrays.toString(constructors));

	}

}