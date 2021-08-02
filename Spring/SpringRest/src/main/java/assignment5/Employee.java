package assignment5;

public class Employee {

	int empId;
	String empName;
	String empDepartment;
	String empDesignation;
	long empSalary;
	
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
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	
	public Employee(int empId, String empName, String empDepartment, String empDesignation, long empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}
	
	public Employee()
	{
		
	}
	
	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment
				+ ", empDesignation=" + empDesignation + ", empSalary=" + empSalary + "]";
	}
}
