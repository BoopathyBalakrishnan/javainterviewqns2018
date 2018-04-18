package objecttofile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteToFile {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(new File("Object.txt"));
		ObjectOutputStream output = new ObjectOutputStream(file);
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("java");
		employee.setDepartment("core");
		output.writeObject(employee);
		output.close();
		file.close();
		System.out.println("Object is saved in file");
	}

}
