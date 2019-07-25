package training.servlets.beans;

public class EmployeeBean {
	private int empId;
	private String empName;
	private String empLocation;
	private int empSalary;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public EmployeeBean(int empId, String empName, String empLocation, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLocation = empLocation;
		this.empSalary = empSalary;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

}