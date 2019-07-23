package training.jdbc.client;


import java.util.List;

import training.jdbc.beans.Employee;
import training.jdbc.dao.EmployeeDAO;

public class App {
	public static void main(String[] args) {
//		//insert logic
//		Employee employee = new Employee(1001, "Raj", "raj@ps.com", "1980-09-09", 20, 40000);
//		
//		IEmployeeDAO dao = new EmployeeDAO();
//		System.out.println(dao.insertEmployee(employee)?"inserted":"not inserted");
		
		//getEmployee logic
		EmployeeDAO dao = new EmployeeDAO();
		//Employee e = dao.getEmployee(1);
		List<Employee> e = dao.getAllEmployee();
		
		System.out.println(e);
	}
	
}
