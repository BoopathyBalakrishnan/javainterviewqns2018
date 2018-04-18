package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(43, "struts", "j2ee");
		/*
		 * emp.setId(43); emp.setName("j2ee"); emp.setDepartment("j2ee");
		 */

		Employee emp1 = new Employee(23, "java", "core");
		/*
		 * emp1.setId(23); emp1.setName("java"); emp1.setDepartment("core");
		 */

		Employee emp2 = new Employee(31, "jsp", "j2ee");
		/*
		 * emp2.setId(31); emp2.setName("jsp"); emp2.setDepartment("j2ee");
		 */
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp);
		employees.add(emp1);
		employees.add(emp2);
		Collections.sort(employees);

		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
