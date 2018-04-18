package comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	public int compare(Employee emp, Employee emp1) {
		return emp.getId() - emp1.getId();
	}

}
