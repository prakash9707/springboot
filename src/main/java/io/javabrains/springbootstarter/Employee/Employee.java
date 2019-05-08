package io.javabrains.springbootstarter.Employee;

public class Employee {

	private int empId;
	private String empName;
	private String position;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Employee(int empId, String empName, String position) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.position = position;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}
