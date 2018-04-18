package spring.reflection;

import java.util.HashMap;
import java.util.Map;

public class SpringReflectionDemo {

	public static void main(String[] args) {
		BeanMapper mapper = new BeanMapper();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "java");
		map.put("age", 20);
		map.put("department","IT");
		
		Employee obj = (Employee) mapper.setBeanValues("spring.reflection.Employee",map);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getDepartment());

	}

}
