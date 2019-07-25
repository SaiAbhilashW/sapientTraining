package training.services;

import java.util.List;

import training.jdbc.beans.Employee;

public class EmployeeDAO {
	public List<Employee> getAllEmployees(){
		return new training.jdbc.dao.EmployeeDAO().getAllEmployee();
	}
	
}
