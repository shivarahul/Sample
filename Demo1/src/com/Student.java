package com;

public class Student {
	
	private String sName;
	
	private int sScore;
	
	private Employee employee;
	
	public Student() {
		
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsScore() {
		return sScore;
	}

	public void setsScore(int sScore) {
		this.sScore = sScore;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Student(String sName, int sScore, Employee employee) {
		super();
		this.sName = sName;
		this.sScore = sScore;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sScore=" + sScore + ", employee=" + employee.getId()+employee.getName() + "]";
	}
	
	

	
}
