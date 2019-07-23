package training.jdbc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import training.jdbc.beans.Employee;
import training.jdbc.connections.GetConnection;
import training.jdbc.standards.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO{
	@Override
	public boolean insertEmployee(Employee employee) {
		//? is substituted by stuff in gc.rs.someFunc
		String sql = "insert into employee values(?,?,?,?,?,?)";
		GetConnection gc =  new GetConnection();
		
		try {
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, employee.getEmpId());
			gc.ps.setString(2, employee.getEmpName());
			gc.ps.setString(3, employee.getEmpEmail());
			gc.ps.setString(4, employee.getEmpDob());
			gc.ps.setInt(5, employee.getDeptId());
			gc.ps.setDouble(6, employee.getEmpSalary());
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return false;
	}


	

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean updateEmployee(int empId, double empSalary) {
		// TODO Auto-generated method stub
		String sql = "update employee set emp_salary=100000 where emp_id=1";
		GetConnection gc =  new GetConnection();
		
		
		return false;
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		String sql = "select  emp_id , emp_name , emp_email , emp_dob   , dept_id , emp_salary from employee where emp_id=?";
		GetConnection gc = new GetConnection();
		
		try {
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			gc.rs1 = gc.ps.executeQuery();
			
			if(gc.rs1.next()) {
				Employee e = new Employee();
				e.setEmpId(gc.rs1.getInt("emp_id"));
				e.setEmpName(gc.rs1.getString("emp_name"));
				e.setEmpEmail(gc.rs1.getString("emp_email"));
				e.setEmpDob(gc.rs1.getString("emp_dob"));
				e.setDeptId(gc.rs1.getInt("dept_id"));
				e.setEmpSalary(gc.rs1.getInt("emp_salary"));
				
				return e;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> emps = new ArrayList<>();
		String sql = "select  emp_id , emp_name , emp_email , emp_dob   , dept_id , emp_salary from employee";
		GetConnection gc = null;
		
		try {
			gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			
			gc.rs1 = gc.ps.executeQuery();
			
			while(gc.rs1.next()) {
				Employee e = new Employee();
				e.setEmpId(gc.rs1.getInt("emp_id"));
				e.setEmpName(gc.rs1.getString("emp_name"));
				e.setEmpEmail(gc.rs1.getString("emp_email"));
				e.setEmpDob(gc.rs1.getString("emp_dob"));
				e.setDeptId(gc.rs1.getInt("dept_id"));
				e.setEmpSalary(gc.rs1.getInt("emp_salary"));
				
				emps.add(e);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
				gc.rs1.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return emps; 
	}
}
