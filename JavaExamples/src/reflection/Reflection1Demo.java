package reflection;

public class Reflection1Demo {

	public static void main(String[] args) {
		try {
			SpringSetterInjection factory = new SpringSetterInjection();
			Reflection1 reflection = (Reflection1) factory.getObject();
			reflection.getEmployee().setAge(10);

			System.out.println(reflection.getEmployee().getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
