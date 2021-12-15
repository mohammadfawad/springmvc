package com.springframework.springmvc.DTO;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalery;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalery() {
		return employeeSalery;
	}
	public void setEmployeeSalery(double employeeSalery) {
		this.employeeSalery = employeeSalery;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalery="
				+ employeeSalery + "]";
	}
	
	
}
