package classloader;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class CustomClassLoader extends ClassLoader {

	public CustomClassLoader(ClassLoader classLoader) {
		super(classLoader);
	}

	private Class getClass(String fileName) throws ClassNotFoundException {
		String file = fileName.replace(".", File.separator) + ".class";
		byte[] byteArray = null;
		try {
			byteArray = loadClassFileData(file);
			Class c = defineClass(fileName, byteArray, 0, byteArray.length);
			resolveClass(c);
			return c;

		} catch (IOException ie) {
			return null;
		}

	}

	private byte[] loadClassFileData(String fileName) throws IOException {
		InputStream stream = getClass().getClassLoader().getResourceAsStream(fileName);
		byte[] byteArray = null;
		int size = stream.available();
		byteArray = new byte[size];

		DataInputStream inputStream = new DataInputStream(stream);
		inputStream.readFully(byteArray);
		inputStream.close();

		return byteArray;
	}

	@Override
	public Class loadClass(String fileName) throws ClassNotFoundException {
		if (fileName.startsWith("classloader")) {
			return getClass(fileName);
		}

		return super.loadClass(fileName);
	}

}
