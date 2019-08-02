package project.coffee;

public class Employee {
	private String empId;
	private String empPswd;
	
	
	public Employee(String empId, String empPswd) {
		super();
		this.empId = empId;
		this.empPswd = empPswd;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpPswd() {
		return empPswd;
	}
	public void setEmpPswd(String empPswd) {
		this.empPswd = empPswd;
	}
		
}
 