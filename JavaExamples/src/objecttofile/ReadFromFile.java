package objecttofile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream inputStream = new FileInputStream(new File("Object.txt"));
		ObjectInputStream dataStream = new ObjectInputStream(inputStream);
		Employee emp = (Employee) dataStream.readObject();

		System.out.println("Id " + emp.getId() + " name " + emp.getName() + " department " + emp.getDepartment());
		dataStream.close();
		inputStream.close();

	}

}
