package training.day1;

class Employee{
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		if(empName.length() < 3) {
			System.out.println("Sorry name too small");
			this.empName = "No Name";
		} else {
			this.empName = empName;
		}
		this.empSalary = empSalary;
	}
	
	public void display() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
}
