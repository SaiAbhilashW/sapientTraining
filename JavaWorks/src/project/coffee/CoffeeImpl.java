package project.coffee;

import java.util.HashMap;

public class CoffeeImpl {
	public static void main(String[] args) {
		System.out.println("Welcome!");
		
		HashMap<String, Employee> employeeDirectory = new HashMap<>();
		Employee e1 = new Employee("sai", "sai");
		Employee e2 = new Employee("may", "may");
		Employee e3 = new Employee("uma", "uma");
		
		employeeDirectory.put("sai", e1);
		employeeDirectory.put("may", e2);	
		employeeDirectory.put("uma", e3);
		
		
		Employee e = employeeDirectory.get("sai");		
		
	}
}
